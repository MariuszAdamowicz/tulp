package tulp.domain.classes;

import tulp.domain.statements.Constant;
import tulp.domain.statements.Print;

import java.util.*;

public class Method {

    private String methodName;
    private Map<String, Constant> constants;
    private List<Print> prints;

    public Method(String methodName) {
        this.methodName = methodName;
        this.constants = new HashMap<>();
        this.prints = new ArrayList<>();
    }

    public String getMethodName() {
        return methodName;
    }

    public void addConstant(Constant constant) {
        constants.put(constant.getName(), constant);
    }

    public void addPrint(Print print) {
        prints.add(print);
    }

    public Collection<Constant> getConstants() {
        return constants.values();
    }

    public List<Print> getPrints() {
        return prints;
    }

    public Constant getConstant(String constantName) {
        return constants.get(constantName);
    }
}
