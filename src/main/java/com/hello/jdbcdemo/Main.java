package com.hello.jdbcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        UserJDBCTemplate userJDBCTemplateBean = (UserJDBCTemplate)context.getBean("userJDBCTemplateBean");

        System.out.println("------Records Creation--------" );
//        userJDBCTemplateBean.create("Zara", "Kee", "zk@gmail.com");
//        userJDBCTemplateBean.create("Nuha", "Dua", "ndua@gmail.com");
//        userJDBCTemplateBean.create("Ayan", "Mo", "moayan@gmail.com");

        System.out.println("------Listing Multiple Records--------" );
        List<User> Users = userJDBCTemplateBean.listUsers();

        for (User record : Users) {
            System.out.println(" ");
            System.out.print("ID : " + record.getId() );
            System.out.print(", First name : " + record.getFirstName() );
            System.out.print(", Last name : " + record.getLastName());
            System.out.print(", Email : " + record.getEmail());
        }
        System.out.println(" ");
        System.out.println("----Updating Record with ID = 3 -----" );
        System.out.println(" ");

        userJDBCTemplateBean.update(3L, "updatedLastName");

        System.out.println("----Listing Record with ID = 1 -----" );
        User user = userJDBCTemplateBean.getUser(1L);
        System.out.println(" ");
        System.out.print("ID : " + user.getId() );
        System.out.print(", First name : " + user.getFirstName() );
        System.out.print(", Last name : " + user.getLastName());
        System.out.print(", Email : " + user.getEmail());

//        System.out.println(" ");
//        System.out.println("----Deleting records -----" );
//        System.out.println(" ");
//        for (long i = 3; i < 9; i++) {
//            userJDBCTemplateBean.delete(i);
//        }

    }
}
