package tulp;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import tulp.domain.common.CompilationUnit;
import tulp.visitors.CompilationUnitVisitor;

import java.io.IOException;

public class Parser {

    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
//        CharStream charStream = new ANTLRFileStream(fileAbsolutePath);
        CharStream charStream = CharStreams.fromFileName(fileAbsolutePath);
        TulpLexer lexer = new TulpLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TulpParser parser = new TulpParser(tokenStream);

//        ANTLRErrorListener errorListener = new EnkelTreeWalkErrorListener(); //EnkelTreeWalkErrorListener - handles parse tree visiting error events
//        parser.addErrorListener(errorListener);

        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}
