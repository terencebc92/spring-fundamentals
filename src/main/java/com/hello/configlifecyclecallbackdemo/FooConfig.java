package com.hello.configlifecyclecallbackdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfig {

    // Here I specify the init and destroy methods, much like how it would be done in an xml file
    @Bean(initMethod = "init", destroyMethod = "cleanup" )
    public Foo foo() {
        return new Foo();
    }
}
