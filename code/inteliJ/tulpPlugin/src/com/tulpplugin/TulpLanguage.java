package com.tulpplugin;

import com.intellij.lang.Language;

public class TulpLanguage extends Language {
    public static final TulpLanguage INSTANCE = new TulpLanguage();

    private TulpLanguage() {
        super("Tulp");
    }
}
