package tulp.visitors;

import tulp.TulpBaseVisitor;
import tulp.TulpParser;
import tulp.domain.statements.Constant;

public class ConstantVisitor extends TulpBaseVisitor<Constant> {

    private int id;

    public ConstantVisitor(int id) {
        super();
        this.id = id;
    }

    @Override
    public Constant visitConstant(TulpParser.ConstantContext ctx) {
        System.out.println("Visiting Constant");
        String constantName = ctx.ID().toString();
        int constantType = ctx.value().getStart().getType();
        String constantValue = ctx.value().getText();
        return new Constant(id, constantName, constantType, constantValue);
    }

}
