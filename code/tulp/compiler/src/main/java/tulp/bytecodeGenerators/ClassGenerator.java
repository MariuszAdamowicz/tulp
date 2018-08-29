package tulp.bytecodeGenerators;

import org.objectweb.asm.MethodVisitor;
import tulp.domain.classes.ClassDeclaration;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import tulp.domain.classes.Method;
import java.util.List;


public class ClassGenerator {

//    private static final int CLASS_VERSION = Opcodes.V1_8; //52;
//    private ClassWriter classWriter;
//
//    public ClassGenerator() {
//        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
//    }

    public ClassWriter generate(ClassDeclaration classDeclaration, String startMethod) {
        String name = classDeclaration.getClassName();
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
        classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, name,null,"java/lang/Object",null);
        if(startMethod != null) {
            generateConstructor(classWriter, name);
            generateMainFunction(classWriter, name, startMethod);
        }
        List<Method> methods = classDeclaration.getMethods();
        methods.forEach(function -> new MethodGenerator(classWriter).generate(function));

        classWriter.visitEnd();
        return classWriter;
    }

    private void generateMainFunction(ClassWriter classWriter, String className, String startMethod) {
        MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main",
                "([Ljava/lang/String;)V", null, null);

        constructorCall(methodVisitor, className);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, className, startMethod, "()V", false);

        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(-1, -1);

        methodVisitor.visitEnd();
    }

    private void generateConstructor(ClassWriter classWriter, String className) {
        MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "<init>",
                "()V", null, null);

        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(-1, -1);

        methodVisitor.visitEnd();
    }

    private void constructorCall(MethodVisitor methodVisitor, String className) {
//        String ownerDescriptor = scope.getClassInternalName(); //example : java/lang/String
        methodVisitor.visitTypeInsn(Opcodes.NEW, className); //NEW instruction takes object decriptor as an input
        methodVisitor.visitInsn(Opcodes.DUP); //Duplicate (we do not want invokespecial to "eat" our brand new object
//        FunctionSignature methodCallSignature = scope.getMethodCallSignature(constructorCall.getIdentifier(),constructorCall.getArguments());
//        String methodDescriptor = DescriptorFactory.getMethodDescriptor(methodCallSignature);
//        generateArguments(constructorCall);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, className, "<init>", "()V", false);
    }


}
