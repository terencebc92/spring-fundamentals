package com.hello.injectinginnerbeansdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        /**
         * 1) TextEditor no arg constructor
             * 1a) SpellChecker no arg constructor
             * 1b) Init SpellChecker
         * 2) TextEditor.set(spellchecker)
         * 3) Init TextEditor
         * 4) call texteditor.spellcheck()
         */
    }
}
