package com.mariuszadamowicz;

import com.mariuszadamowicz.bytecodegeneration.instructions.Instruction;
import com.mariuszadamowicz.parsing.SyntaxTreeTraverser;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.Queue;

public class Compiler {

    public static void main(String[] args) throws Exception {
        new Compiler().compile(args);
    }

    public void compile(String[] args) throws Exception {
        //arguments validation skipped (check out full code on github)
        final File tulpFile = new File(args[0]);
        String fileName = tulpFile.getName();
        String fileAbsolutePath = tulpFile.getAbsolutePath();
        String className = StringUtils.remove(fileName, ".tulp");
        final Queue<Instruction> instructionsQueue = new SyntaxTreeTraverser().getInstructions(fileAbsolutePath);
        //TODO: generate bytecode based on instructions
    }
}