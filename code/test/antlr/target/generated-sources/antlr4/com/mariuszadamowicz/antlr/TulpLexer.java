// Generated from com/mariuszadamowicz/antlr/Tulp.g4 by ANTLR 4.3
package com.mariuszadamowicz.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TulpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, EQUALS=2, NUMBER=3, STRING=4, ID=5, WS=6, LEFT_BRACKET=7, RIGHT_BRACKET=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'"
	};
	public static final String[] ruleNames = {
		"PRINT", "EQUALS", "NUMBER", "STRING", "ID", "WS", "LEFT_BRACKET", "RIGHT_BRACKET"
	};


	public TulpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tulp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\65\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\6\4\35\n\4\r\4\16\4\36\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\6\6\'\n\6\r\6\16\6(\3\7\6\7,\n\7\r\7\16\7-\3\7\3\7\3\b\3\b\3\t\3\t\2"+
		"\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\5\3\2\62;\5\2\62;C\\c|\5\2"+
		"\13\f\17\17\"\"\67\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\31\3\2\2"+
		"\2\7\34\3\2\2\2\t \3\2\2\2\13&\3\2\2\2\r+\3\2\2\2\17\61\3\2\2\2\21\63"+
		"\3\2\2\2\23\24\7r\2\2\24\25\7t\2\2\25\26\7k\2\2\26\27\7p\2\2\27\30\7v"+
		"\2\2\30\4\3\2\2\2\31\32\7?\2\2\32\6\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2"+
		"\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\b\3\2\2\2 !\7)\2\2!\""+
		"\7\60\2\2\"#\7,\2\2#$\7)\2\2$\n\3\2\2\2%\'\t\3\2\2&%\3\2\2\2\'(\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2)\f\3\2\2\2*,\t\4\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2"+
		"\2\2-.\3\2\2\2./\3\2\2\2/\60\b\7\2\2\60\16\3\2\2\2\61\62\7*\2\2\62\20"+
		"\3\2\2\2\63\64\7+\2\2\64\22\3\2\2\2\6\2\36(-\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}