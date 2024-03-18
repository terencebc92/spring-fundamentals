package com.hello.aspectdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println("### starting execution of student methods... ###");
        /**
         Logging before advice: Going to setup student profile.
         Name : Zara
         Logging after advice: Student profile has been setup.
         Logging after returning advice: Returning:Zara
         */
        student.getName();

        /**
         Logging before advice: Going to setup student profile.
         Age : 11
         Logging after advice: Student profile has been setup.
         Logging after returning advice: Returning:11
         */
        student.getAge();

        /**
         Logging before advice: Going to setup student profile.
         Exception raised
         Logging after advice: Student profile has been setup.
         Logging after throwing advice: There has been an exception: java.lang.IllegalArgumentException
         */
        student.printThrowException();
    }

}
