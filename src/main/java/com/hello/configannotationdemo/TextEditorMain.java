package com.hello.configannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TextEditorMain {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);
        System.out.println("Context initialized");
        TextEditorbean te = ctx.getBean(TextEditorbean.class);
        te.spellCheck();
        // Flow:
        // 1) Context is initializing
        //   1a) Spellcheckerbean constructor
        //   1b) TextEditorbean constructor
        // 2) spellCheck() execution
    }
}
