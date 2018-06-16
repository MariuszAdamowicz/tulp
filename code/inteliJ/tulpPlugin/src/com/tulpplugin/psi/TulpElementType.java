package com.tulpplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.tulpplugin.TulpLanguage;
import org.jetbrains.annotations.*;

public class TulpElementType extends IElementType {
    public TulpElementType(@NotNull @NonNls String debugName) {
        super(debugName, TulpLanguage.INSTANCE);
    }
}

