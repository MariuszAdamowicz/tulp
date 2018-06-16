package com.tulpplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;
import javax.swing.*;

public class TulpFileType extends LanguageFileType {
    public static final TulpFileType INSTANCE = new TulpFileType();

    private TulpFileType() {
        super(TulpLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Tulp file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Tulp language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "tulp";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TulpIcons.FILE;
    }
}
