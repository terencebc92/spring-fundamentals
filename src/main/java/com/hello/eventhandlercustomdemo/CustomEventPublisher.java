package com.hello.eventhandlercustomdemo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        System.out.println("Event publishing...");
        publisher.publishEvent(ce);
    }
}