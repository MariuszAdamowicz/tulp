package tulp.visitors;

import tulp.TulpBaseVisitor;
import tulp.TulpParser;
import tulp.domain.statements.Constant;
import tulp.domain.statements.Print;

public class PrintVisitor extends TulpBaseVisitor<Print> {

    @Override
    public Print visitPrint(TulpParser.PrintContext ctx) {
        System.out.println("Visiting Print");
        String constantName = ctx.ID().toString();
        return new Print(constantName);
    }

}
