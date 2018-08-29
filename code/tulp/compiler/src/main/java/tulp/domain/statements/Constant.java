package tulp.domain.statements;

public class Constant {

    private int id;
    private String name;
    private int type;
    private String value;

    public Constant(int id, String name, int type, String value) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
