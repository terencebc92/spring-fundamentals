package com.hello.configscopedemo;

import com.hello.configlifecyclecallbackdemo.Foo;
import com.hello.prototypedemo.MyPrototype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        Foo objA = context.getBean(Foo.class);
        // prototypeBean is fetched from the context, stored as objA. and I set the message.

        objA.setMessage("I'm object A");
        objA.getMessage();

        // prototypeBean is fetched from the context, stored as objB. and I don't set the message.
        // Output from objB is null.
        // Therefore, objB is a different bean (same bean id), unlike singleton.

        Foo objB = context.getBean(Foo.class);
        objB.getMessage();

        objA = context.getBean(Foo.class);
        // prototypeBean is fetched again, and stored into objA.
        // output from this objA is null
        // It appears that after calling context.getBean(), a new object is returned every time.
        objA.getMessage();
    }
}
