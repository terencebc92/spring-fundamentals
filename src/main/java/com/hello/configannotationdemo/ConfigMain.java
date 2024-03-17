package com.hello.configannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ConfigMain {

    public static void main(String[] args) {
        // Using AnnotationConfigApplicationContext, passing in the config class or registering it below)
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ConfigBeanConfig.class);
        ctx.refresh();
        // getBean by .class
        ConfigBean configBean = ctx.getBean(ConfigBean.class);
        configBean.setMessage("Hello World!");
        configBean.getMessage();
    }






}
