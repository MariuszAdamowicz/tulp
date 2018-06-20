// Generated from com/mariuszadamowicz/antlr/Tulp.g4 by ANTLR 4.3
package com.mariuszadamowicz.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TulpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, EQUALS=2, NUMBER=3, STRING=4, ID=5, WS=6, LEFT_BRACKET=7, RIGHT_BRACKET=8;
	public static final String[] tokenNames = {
		"<INVALID>", "'print'", "'='", "NUMBER", "''.*''", "ID", "WS", "'('", 
		"')'"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_constant = 1, RULE_print = 2, RULE_value = 3;
	public static final String[] ruleNames = {
		"compilationUnit", "constant", "print", "value"
	};

	@Override
	public String getGrammarFileName() { return "Tulp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TulpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode EOF() { return getToken(TulpParser.EOF, 0); }
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TulpListener ) ((TulpListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TulpListener ) ((TulpListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT || _la==ID) {
				{
				setState(10);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(8); constant();
					}
					break;
				case PRINT:
					{
					setState(9); print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TulpParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(TulpParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TulpListener ) ((TulpListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TulpListener ) ((TulpListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); match(ID);
			setState(18); match(EQUALS);
			setState(19); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TulpParser.ID, 0); }
		public TerminalNode PRINT() { return getToken(TulpParser.PRINT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(TulpParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(TulpParser.RIGHT_BRACKET, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TulpListener ) ((TulpListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TulpListener ) ((TulpListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); match(PRINT);
			setState(22); match(LEFT_BRACKET);
			setState(23); match(ID);
			setState(24); match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public Token op;
		public TerminalNode STRING() { return getToken(TulpParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(TulpParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TulpListener ) ((TulpListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TulpListener ) ((TulpListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(28);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); ((ValueContext)_localctx).op = match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); ((ValueContext)_localctx).op = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n!\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5\37\n\5\3\5\2\2\6\2\4\6\b\2\2"+
		"\37\2\16\3\2\2\2\4\23\3\2\2\2\6\27\3\2\2\2\b\36\3\2\2\2\n\r\5\4\3\2\13"+
		"\r\5\6\4\2\f\n\3\2\2\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17\3"+
		"\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7"+
		"\7\2\2\24\25\7\4\2\2\25\26\5\b\5\2\26\5\3\2\2\2\27\30\7\3\2\2\30\31\7"+
		"\t\2\2\31\32\7\7\2\2\32\33\7\n\2\2\33\7\3\2\2\2\34\37\7\5\2\2\35\37\7"+
		"\6\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\t\3\2\2\2\5\f\16\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}