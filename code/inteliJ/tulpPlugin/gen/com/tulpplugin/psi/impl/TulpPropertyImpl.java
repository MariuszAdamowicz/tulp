// This is a generated file. Not intended for manual editing.
package com.tulpplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tulpplugin.psi.TulpTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.tulpplugin.psi.*;

public class TulpPropertyImpl extends ASTWrapperPsiElement implements TulpProperty {

  public TulpPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TulpVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TulpVisitor) accept((TulpVisitor)visitor);
    else super.accept(visitor);
  }

}
