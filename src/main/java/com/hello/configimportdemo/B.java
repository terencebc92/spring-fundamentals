package com.hello.configimportdemo;

public class B {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("B class: Your Message : " + message);
    }

}
