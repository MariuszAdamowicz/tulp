package com.tulpplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.tulpplugin.TulpLanguage;
import org.jetbrains.annotations.*;

public class TulpTokenType extends IElementType {
    public TulpTokenType(@NotNull @NonNls String debugName) {
        super(debugName, TulpLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TulpTokenType." + super.toString();
    }
}
