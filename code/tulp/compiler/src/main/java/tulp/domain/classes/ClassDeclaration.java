package tulp.domain.classes;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration {

    private String className;
    private List<Method> methods;

    public ClassDeclaration(String className) {
        System.out.println("Class name is "+className);
        this.className = className;
        this.methods = new ArrayList<>();
    }

    public void addMethod(Method method) {
        methods.add(method);
    }

    public String getClassName() {
        return className;
    }

    public List<Method> getMethods() {
        return methods;
    }
}
