package com.mariuszadamowicz.bytecodegeneration.instructions;

import com.mariuszadamowicz.antlr.TulpLexer;
import com.mariuszadamowicz.bytecodegeneration.instructions.Instruction;
import com.mariuszadamowicz.parsing.domain.Variable;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class VariableDeclaration implements Instruction, Opcodes {
    Variable variable;

    public VariableDeclaration(Variable variable) {
        this.variable = variable;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final int type = variable.getType();
        if(type == TulpLexer.NUMBER) {
            int val = Integer.valueOf(variable.getValue());
            mv.visitIntInsn(BIPUSH,val);
            mv.visitVarInsn(ISTORE,variable.getId());
        } else if(type == TulpLexer.STRING) {
            mv.visitLdcInsn(variable.getValue());
            mv.visitVarInsn(ASTORE,variable.getId());
        }
    }
}
