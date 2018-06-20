// Generated from com/mariuszadamowicz/antlr/Tulp.g4 by ANTLR 4.3
package com.mariuszadamowicz.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TulpParser}.
 */
public interface TulpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TulpParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull TulpParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TulpParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull TulpParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link TulpParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull TulpParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TulpParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull TulpParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link TulpParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull TulpParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TulpParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull TulpParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link TulpParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull TulpParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TulpParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull TulpParser.ValueContext ctx);
}