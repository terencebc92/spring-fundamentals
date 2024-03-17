package com.hello.postprocessordemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // When IOC loads, all beans are initialized.
        //   When I have a BeanPostProcessor implementation, I have additional 2 methods.
        //   1 method is called before the bean init
        //   1 method is called after the bean init
        // The flow for 1 bean is: postProcessBeforeInitialization, init, then postProcessAfterInitialization
        PostProcessorBeanExample obj = (PostProcessorBeanExample) context.getBean("postProcessBeanExample");
        obj.getMessage();
        context.registerShutdownHook();

        // Once IOC is destroyed, all the bean destroy methods are called
    }
}
