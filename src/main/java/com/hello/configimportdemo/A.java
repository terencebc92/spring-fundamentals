package com.hello.configimportdemo;

public class A {

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("A class: Your Message : " + message);
    }
}
