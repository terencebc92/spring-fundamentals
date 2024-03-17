package com.hello.configannotationdemo;

public class TextEditorbean {

    private SpellCheckerbean spellCheckerbean;

    public TextEditorbean(SpellCheckerbean spellCheckerbean){
        System.out.println("Inside TextEditorbean constructor." );
        this.spellCheckerbean = spellCheckerbean;
    }
    public void spellCheck(){
        spellCheckerbean.checkSpelling();
    }

}
