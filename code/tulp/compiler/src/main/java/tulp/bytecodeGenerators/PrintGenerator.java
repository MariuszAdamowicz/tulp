package tulp.bytecodeGenerators;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import tulp.TulpLexer;
import tulp.domain.statements.Constant;

public class PrintGenerator {

    private MethodVisitor methodVisitor;

    public PrintGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
    }

    public void generate(Constant constant) {
        final int type = constant.getType();
        final int id = constant.getId();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        if (type == TulpLexer.NUMBER) {
            methodVisitor.visitVarInsn(Opcodes.ILOAD, id);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
        } else if (type == TulpLexer.STRING) {
            methodVisitor.visitVarInsn(Opcodes.ALOAD, id);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        }
    }
}
