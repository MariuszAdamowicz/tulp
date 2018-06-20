package com.mariuszadamowicz.parsing;

import com.mariuszadamowicz.antlr.TulpLexer;
import com.mariuszadamowicz.antlr.TulpParser;
import com.mariuszadamowicz.bytecodegeneration.instructions.Instruction;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.Queue;

public class SyntaxTreeTraverser {
    public Queue<Instruction> getInstructions(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath); //fileAbolutePath - file containing first enk code file
        TulpLexer lexer = new TulpLexer(charStream);  //create lexer (pass enk file to it)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TulpParser parser = new TulpParser(tokenStream);
        TulpTreeWalkListener listener = new TulpTreeWalkListener(); // TulpTreeWalkListener extends TulpBaseLitener - handles parse tree visiting events
        BaseErrorListener errorListener = new TulpTreeWalkErrorListener(); // TulpTreeWalkErrorListener - handles parse tree visiting error events

        parser.addErrorListener(errorListener);
        parser.addParseListener(listener);
        parser.compilationUnit(); //compilation unit is root parser rule - start from it!
        return listener.getInstructionsQueue();
    }
}
