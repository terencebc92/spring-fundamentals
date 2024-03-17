package com.hello.injectinginnerbeansdemo;

public class TextEditor {
    public TextEditor() {
        System.out.println("Text editor's no arg constructor");
    }

    public void init() {
        System.out.println("Text editor's init method");
    }

    private com.hello.injectinginnerbeansdemo.SpellChecker spellChecker;

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Text editor's set method, setting spell checker." );
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
