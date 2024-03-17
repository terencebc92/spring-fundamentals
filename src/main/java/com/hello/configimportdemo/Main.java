package com.hello.configimportdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Here I only load ConfigB,
        // But because I have imported ConfigA in the ConfigB class, configA is initialized in the IOC, so I can call it
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);

        // now both beans A and B will be available...
        A a = ctx.getBean(A.class);
        a.getMessage();
        B b = ctx.getBean(B.class);
        b.getMessage();

    }
}
