package com.mariuszadamowicz.parsing;

import com.mariuszadamowicz.antlr.TulpBaseListener;
import com.mariuszadamowicz.antlr.TulpParser;
import com.mariuszadamowicz.bytecodegeneration.instructions.Instruction;
import com.mariuszadamowicz.bytecodegeneration.instructions.PrintVariable;
import com.mariuszadamowicz.bytecodegeneration.instructions.VariableDeclaration;
import com.mariuszadamowicz.parsing.domain.Variable;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class TulpTreeWalkListener extends TulpBaseListener {

    Queue<Instruction> instructionsQueue = new ArrayDeque<Instruction>();
    Map<String, Variable> variables = new HashMap<String, Variable>();

    public Queue<Instruction> getInstructionsQueue() {
        return instructionsQueue;
    }

    @Override
    public void exitConstant(@NotNull TulpParser.ConstantContext ctx) {
        final TerminalNode varName = ctx.ID();
        final TulpParser.ValueContext varValue = ctx.value();
        final int varType = varValue.getStart().getType();
        final int varIndex = variables.size();
        final String varTextValue = varValue.getText();
        Variable var = new Variable(varIndex, varType, varTextValue);
        variables.put(varName.getText(), var);
        instructionsQueue.add(new VariableDeclaration(var));
        logVariableDeclarationStatementFound(varName, varValue);
    }

    @Override
    public void exitPrint(@NotNull TulpParser.PrintContext ctx) {
        final TerminalNode varName = ctx.ID();
        final boolean printedVarNotDeclared = !variables.containsKey(varName.getText());
        if (printedVarNotDeclared) {
            final String erroFormat = "ERROR: WTF? You are trying to print var '%s' which has not been declared!!!111. ";
            System.out.printf(erroFormat, varName.getText());
            return;
        }
        final Variable variable = variables.get(varName.getText());
        instructionsQueue.add(new PrintVariable(variable));
        logPrintStatementFound(varName, variable);
    }

    private void logVariableDeclarationStatementFound(TerminalNode varName, TulpParser.ValueContext varValue) {
        final int line = varName.getSymbol().getLine();
        final String format = "OK: You declared variable named '%s' with value of '%s' at line '%s'.\n";
        System.out.printf(format, varName, varValue.getText(), line);
    }

    private void logPrintStatementFound(TerminalNode varName, Variable variable) {
        final int line = varName.getSymbol().getLine();
        final String format = "OK: You instructed to print variable '%s' which has value of '%s' at line '%s'.'\n";
        System.out.printf(format,variable.getId(),variable.getValue(),line);
    }
}