package com.hello.configlifecyclecallbackdemo;

import com.hello.configimportdemo.A;
import com.hello.configimportdemo.B;
import com.hello.configimportdemo.ConfigB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext aac = new AnnotationConfigApplicationContext(FooConfig.class);

        //Foo's init and cleanup method are called
        Foo foo = aac.getBean(Foo.class);
        aac.registerShutdownHook();

    }
}
