package tulp.domain.common;

import tulp.domain.classes.ClassDeclaration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CompilationUnit {
    private List<ClassDeclaration> classDeclarations;

    public CompilationUnit() {
        this.classDeclarations = new ArrayList<ClassDeclaration>();
    }

    public void add(ClassDeclaration classDeclaration) {
        classDeclarations.add(classDeclaration);
    }

    public Collection<ClassDeclaration> getClassDeclarations() {
        return classDeclarations;
    }
}
