package tulp.visitors;

import tulp.TulpBaseVisitor;
import tulp.TulpParser;
import tulp.domain.common.CompilationUnit;

public class CompilationUnitVisitor extends TulpBaseVisitor<CompilationUnit> {

    @Override
    public CompilationUnit visitCompilationUnit(TulpParser.CompilationUnitContext ctx) {
        System.out.println("Visiting CompilationUnit");
        final CompilationUnit compilationUnit = new CompilationUnit();
        for(TulpParser.ClassDeclarationContext classDeclarationContext : ctx.classDeclaration()) {
            ClassDeclarationVisitor classDeclarationVisitor = new ClassDeclarationVisitor();
            compilationUnit.add(classDeclarationContext.accept(classDeclarationVisitor));
        }
        return compilationUnit;
    }
}
