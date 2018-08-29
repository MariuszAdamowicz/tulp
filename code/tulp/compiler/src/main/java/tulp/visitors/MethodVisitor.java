package tulp.visitors;

import tulp.TulpBaseVisitor;
import tulp.TulpParser;
import tulp.domain.classes.Method;

public class MethodVisitor extends TulpBaseVisitor<Method> {

    private Method method;
    private int constantIndex = 0;

    @Override
    public Method visitMethod(TulpParser.MethodContext ctx) {
        System.out.println("Visiting Method");
        String methodName = ctx.ID().toString();
        method = new Method(methodName);
        ctx.inputTuple().accept(this);
        TulpParser.OutputTupleContext outputTupleContext = ctx.outputTuple();
        if(outputTupleContext != null) {
            outputTupleContext.accept(this);
        }
        TulpParser.AsynchronousOutputTupleContext asynchronousOutputTupleContext = ctx.asynchronousOutputTuple();
        if(asynchronousOutputTupleContext != null) {
            asynchronousOutputTupleContext.accept(this);
        }
        ctx.methodDefinition().accept(this);
        return method;
    }

    @Override
    public Method visitMethodElements(TulpParser.MethodElementsContext ctx) {
        System.out.println("Visiting MethodElements");
        for(TulpParser.ConstantContext constantContext : ctx.constant()) {
            ConstantVisitor constantVisitor = new ConstantVisitor(constantIndex++);
            method.addConstant(constantContext.accept(constantVisitor));
        }
        for(TulpParser.PrintContext printContext : ctx.print()) {
            PrintVisitor printVisitor = new PrintVisitor();
            method.addPrint(printContext.accept(printVisitor));
        }
        return method;
    }

}
