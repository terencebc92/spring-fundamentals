package com.hello.eventhandlercustomdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        CustomEventPublisher cvp =
                (CustomEventPublisher) context.getBean("customEventPublisher");

        cvp.publish();
        // Event is published
        // Listener is triggered

        /**
         * 1) CustomEvent implements ApplicationEvent interface
         * 2) Publisher implements ApplicationEventPublisherAware interface
         *     2a) This is so it can set Spring's ApplicationEventPublisher
         * 3) Listener implements ApplicationListener<CustomEvent> interface
         *     3a) This allows it to define the onApplicationEvent(CustomEvent customEvent) method
         * */
    }

}
