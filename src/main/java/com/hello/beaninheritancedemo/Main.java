package com.hello.hello.beaninheritancedemo;

import com.hello.beaninheritancedemo.ChildBean;
import com.hello.beaninheritancedemo.ParentBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        ParentBean objA = (ParentBean) context.getBean("parentBean");
        objA.getMessage1();
        objA.getMessage2();

        ChildBean objB = (ChildBean) context.getBean("childBean");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }

}
