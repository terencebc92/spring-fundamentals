package com.hello.postprocessordemo;

public class PostProcessorBeanExample {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void init(){
        System.out.println("Init method: MyClass bean is going through init.");
    }
    public void destroy(){
        System.out.println("Destroy method: MyClass bean will destroy now.");
    }
}
