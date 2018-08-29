package tulp.visitors;

import tulp.TulpBaseVisitor;
import tulp.TulpParser;
import tulp.domain.classes.ClassDeclaration;

public class ClassDeclarationVisitor extends TulpBaseVisitor<ClassDeclaration> {

    private ClassDeclaration classDeclaration;

    @Override
    public ClassDeclaration visitClassDeclaration(TulpParser.ClassDeclarationContext ctx) {
        System.out.println("Visiting ClassDeclaration");
        String className = ctx.ID().toString();
        classDeclaration = new ClassDeclaration(className);
        ctx.classDefinition().accept(this);
        return classDeclaration;
    }

    @Override
    public ClassDeclaration visitClassDefinition(TulpParser.ClassDefinitionContext ctx) {
        System.out.println("Visiting ClassDefinition");
        TulpParser.ClassElementsContext classElementsContext = ctx.classElements();
        if(classElementsContext != null) {
            classElementsContext.accept(this);
        }
        return classDeclaration;
    }

    @Override
    public ClassDeclaration visitClassElements(TulpParser.ClassElementsContext ctx) {
        System.out.println("Visiting ClassElements");
        for(TulpParser.MethodContext methodContext : ctx.method()) {
            MethodVisitor methodVisitor = new MethodVisitor();
            classDeclaration.addMethod(methodContext.accept(methodVisitor));
        }
        return classDeclaration;
    }


}
