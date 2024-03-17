package com.hello.injectingcollectionsdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("########### Context initialized ###########");
        JavaCollection jc=(JavaCollection)context.getBean("javaCollectionBean");
        jc.getAddressList(); // [INDIA, Pakistan, USA, USA]
        jc.getAddressSet(); // [INDIA, Pakistan, USA]
        jc.getAddressMap(); // {1=INDIA, 2=Pakistan, 3=USA, 4=USA}
        jc.getAddressProp(); // {four=USA, one=INDIA, two=Pakistan, three=USA}
        jc.getEmptyString(); // ""
        jc.getNullProperty(); // null


        System.out.println("### Below is java collection with bean reference ###");
        JavaCollectionWithBeanReference jcwbr=(JavaCollectionWithBeanReference)context.getBean("javaCollectionBeanWithBeanReference");
        jcwbr.getAddressList(); // [com.hello.HelloWorld@16a0ee18, Pakistan]
        jcwbr.getAddressSet(); // [com.hello.HelloWorld@16a0ee18, Pakistan]
        jcwbr.getAddressMap(); // {one=INDIA, two=com.hello.HelloWorld@16a0ee18}
        jcwbr.getAddressProp(); // null
    }
}
