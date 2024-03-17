package com.hello.initdestroydemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // AbstractApplicationContext is used vs ApplicationContext so that
        // I have access to the .registerShutdownHook() method.
        // Without which, destroy methods wont get called.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // Init method executes during context setup, hence it displays before this sysout("context loaded")

        System.out.println("Context loaded");
        MyInitDestroy obj = (MyInitDestroy) context.getBean("initDestroyBean");
        System.out.println("Bean fetched");
        obj.getMessage();
        System.out.println("Calling shutdown");
        context.registerShutdownHook();
        System.out.println("Complete shutdown");
        // The destroy method executes after "Complete shutdown",
        // meaning that registerShutdownHook only does that, register for shut down
        // The actual execution happens after the main method completes.
    }
}
