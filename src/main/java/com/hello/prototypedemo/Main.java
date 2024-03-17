package com.hello.prototypedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        MyPrototype objA = (MyPrototype) context.getBean("prototypeBean");
        // prototypeBean is fetched from the context, stored as objA. and I set the message.

        objA.setMessage("I'm object A");
        objA.getMessage();

        // prototypeBean is fetched from the context, stored as objB. and I don't set the message.
        // Output from objB is null.
        // Therefore, objB is a different bean (same bean id), unlike singleton.

        MyPrototype objB = (MyPrototype) context.getBean("prototypeBean");
        objB.getMessage();

        objA = (MyPrototype) context.getBean("prototypeBean");
        // prototypeBean is fetched again, and stored into objA.
        // output from this objA is null
        // It appears that after calling context.getBean(), a new object is returned every time.
        objA.getMessage();

    }
}
