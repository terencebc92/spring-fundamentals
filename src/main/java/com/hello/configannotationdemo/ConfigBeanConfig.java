package com.hello.configannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeanConfig {

    @Bean
    public ConfigBean helloWorld() {
        return new ConfigBean();
    }
}
