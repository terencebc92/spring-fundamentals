package com.hello.postprocessordemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("Post processor demo: BeforeInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("Post processor demo: AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}