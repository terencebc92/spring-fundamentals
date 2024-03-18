package com.hello.aspectjdemo;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {

    /** Following is the definition for a pointcut to select
     *  all the methods available. So advice will be called
     *  for all the methods.
     */
    @Pointcut("execution(* com.hello.aspectjdemo.*.*(..))")
    private void selectAll(){}

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("AspectJ: before advice.");
    }

    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("AspectJ: after advice.");
    }

    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(pointcut = "selectAll()", returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("AspectJ: after returning advice:" + retVal.toString() );
    }

    /**
     * This is the method which I would like to execute
     * if there is an exception raised by any method.
     */
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("AspectJ: after throwing advice There has been an exception: " + ex.toString());
    }


}
