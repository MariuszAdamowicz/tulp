package tulp;

//import org.apache.commons.lang3.StringUtils;

import org.apache.commons.io.IOUtils;
import tulp.bytecodeGenerators.BytecodeGenerator;
import tulp.domain.common.CompilationUnit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class Compiler {

    private String startMethod;

    public void setStartMethod(String startMethod) {
        this.startMethod = startMethod;
    }

    public void compile(File tulpFile) throws Exception {
//        String fileName = tulpFile.getName();
        String fileAbsolutePath = tulpFile.getAbsolutePath();
//        String className = StringUtils.remove(fileName, ".tulp");
//        final Queue<Instruction> instructionsQueue = new SyntaxTreeTraverser().getInstructions(fileAbsolutePath);
        CompilationUnit compilationUnit = new Parser().getCompilationUnit(fileAbsolutePath);
        saveBytecodeToClassFile(compilationUnit);
    }

    private void saveBytecodeToClassFile(CompilationUnit compilationUnit) throws IOException {
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator();
        Map<String,byte[]> bytecodes = bytecodeGenerator.generate(compilationUnit, startMethod);
        for (Map.Entry<String, byte[]> bytecode : bytecodes.entrySet()) {
            final String fileName = bytecode.getKey() + ".class";
            OutputStream os = new FileOutputStream(fileName);
            IOUtils.write(bytecode.getValue(), os);
        }
    }

}
