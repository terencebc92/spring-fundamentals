package com.hello.eventhandlercustomdemo;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Application Listener here..");
        System.out.println(event.toString());
    }
}