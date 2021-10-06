package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// this is our aspect and it is an aspect for logging
// Aspect is a java class that has all of our related advices
// first we need to tell Spring that it is an aspect by using @Aspect annotation
// we also want to add @Component to make it available for scanning
@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

    // execution(public void addAccount()) --> this is our point-cut expression so it means calls
    // this before execution of method called addAccount()
    // run this code before target object method addAccount()
    // our point cut expression will match for addAccount() method in any class
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {
        // we can give any method name we want

        // our own custom code that is executed before the method runs
        System.out.println("\n======>>> Executing @Before advice on method addAccount()");
    }
}
