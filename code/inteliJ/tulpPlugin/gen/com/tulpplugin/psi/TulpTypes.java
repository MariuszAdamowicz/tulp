// This is a generated file. Not intended for manual editing.
package com.tulpplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.tulpplugin.psi.impl.*;

public interface TulpTypes {

  IElementType PROPERTY = new TulpElementType("PROPERTY");

  IElementType COMMENT = new TulpTokenType("COMMENT");
  IElementType CRLF = new TulpTokenType("CRLF");
  IElementType KEY = new TulpTokenType("KEY");
  IElementType SEPARATOR = new TulpTokenType("SEPARATOR");
  IElementType VALUE = new TulpTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new TulpPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
