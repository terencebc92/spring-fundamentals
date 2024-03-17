package com.hello.singletondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        MySingleton objA = (MySingleton) context.getBean("singletonBean");

        // Object A is fetched from the context (id: singletonBean) and I set the message.
        objA.setMessage("I'm object A");
        objA.getMessage();

        // Object B is fetched from the context (id:singletonBean) and I call get message.
        // Output is the same as object A.
        // Therefore, object A and object B are the same (bean with id: singletonBean)
        MySingleton objB = (MySingleton) context.getBean("singletonBean");
        objB.getMessage();
    }
}
