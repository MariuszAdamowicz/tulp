package tulp.bytecodeGenerators;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import tulp.domain.classes.Method;
import tulp.domain.statements.Constant;
import tulp.domain.statements.Print;

import java.util.Collection;
import java.util.List;

public class MethodGenerator {

    private ClassWriter classWriter;


    public MethodGenerator(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    public void generate(Method method) {
        MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, method.getMethodName(),
                "()V", null, null);

        Collection<Constant> constants = method.getConstants();
        constants.forEach(constant -> new ConstantGenerator(methodVisitor).generate(constant));

        List<Print> prints = method.getPrints();
        prints.forEach(print -> new PrintGenerator(methodVisitor).generate(method.getConstant(print.getConstantName())));

        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(100, constants.size());

        methodVisitor.visitEnd();
    }

}
