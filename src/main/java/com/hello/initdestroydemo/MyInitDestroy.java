package com.hello.initdestroydemo;

public class MyInitDestroy {

    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void init(){
        System.out.println("Init method: MyInitDestroy Bean is going through init.");
    }
    public void destroy() {
        System.out.println("Destroy method: MyInitDestroy Bean will destroy now.");
    }
}
