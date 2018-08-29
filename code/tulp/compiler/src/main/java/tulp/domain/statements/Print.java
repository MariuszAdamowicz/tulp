package tulp.domain.statements;

public class Print {

    private String constantName;

    public Print(String constantName) {
        this.constantName = constantName;
    }

    public String getConstantName() {
        return constantName;
    }
}
