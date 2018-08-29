package tulp.bytecodeGenerators;

import tulp.domain.classes.ClassDeclaration;
import tulp.domain.common.CompilationUnit;

import java.util.HashMap;
import java.util.Map;

public class BytecodeGenerator {
    public Map<String,byte[]> generate(CompilationUnit compilationUnit, String startMethod) {
        ClassGenerator classGenerator = new ClassGenerator();
        Map<String,byte[]> bytecodes = new HashMap<String,byte[]>();
        for (ClassDeclaration classDeclaration : compilationUnit.getClassDeclarations()) {
            byte[] bytecode = classGenerator.generate(classDeclaration, startMethod).toByteArray();
            bytecodes.put(classDeclaration.getClassName(), bytecode);
        }
        return bytecodes;
    }
}
