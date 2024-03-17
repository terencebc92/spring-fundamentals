package com.hello.configlifecyclecallbackdemo;

public class Foo {

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void init() {
        // initialization logic
        System.out.println("FOO: init method called");
    }
    public void cleanup() {
        // destruction logic
        System.out.println("FOO: cleanup method called");
    }
}
