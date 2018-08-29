package tulp.bytecodeGenerators;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import tulp.TulpLexer;
import tulp.domain.statements.Constant;


public class ConstantGenerator {

    private MethodVisitor methodVisitor;

    public ConstantGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
    }

    public void generate(Constant constant) {
        final int type = constant.getType();
        if(type == TulpLexer.NUMBER) {
            int val = Integer.valueOf(constant.getValue());
//            classWriter.visitField(Opcodes.ACC_PRIVATE + Opcodes.ACC_FINAL, constant.getName(), "I",
//                    null, Integer.valueOf(constant.getValue())).visitEnd();
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, val);
            methodVisitor.visitVarInsn(Opcodes.ISTORE, constant.getId());
        } else if(type == TulpLexer.STRING) {
//            classWriter.visitField(Opcodes.ACC_PRIVATE + Opcodes.ACC_FINAL, constant.getName(), "Ljava/lang/String;",
//                    null, constant.getValue()).visitEnd();
            methodVisitor.visitLdcInsn(constant.getValue());
            methodVisitor.visitVarInsn(Opcodes.ASTORE, constant.getId());
        }
    }
}
