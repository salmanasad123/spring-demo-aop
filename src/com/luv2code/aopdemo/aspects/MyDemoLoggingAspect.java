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
//    @Before("execution(public void addAccount())")
//    public void beforeAddAccountAdvice() {
//        // we can give any method name we want
//
//        // our own custom code that is executed before the method runs
//        System.out.println("\n======>>> Executing @Before advice on method addAccount()");
//    }

    // I want my advice to only match for addAccount() method in AccountDAO class not to the addAccount()
    // method in any other class so we are getting a strict with matching now
    // to achieve this we give fully qualified class name to our point cut expression

    @Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
    public void beforeAddAccountAdvice2() {
        // we can give any method name we want

        // our own custom code that is executed before the method runs
        System.out.println("\n======>>> Executing @Before advice on method addAccount()");
    }

    // match with any method name that starts with add in any class, so we use wild-card
    @Before("execution(public void add*())")
    public void beforeAddAccountAdvice3() {
        // we can give any method name we want

        // our own custom code that is executed before the method runs
        System.out.println("\n======>>> Executing @Before advice on method addAccount()");
    }

    // point cut expression for any method that starts with add and have a parameter of type
    // com.luv2code.aopdemo.Account only and also any return type because we used *
    @Before("exection(* add*(com.luv2code.aopdemo.Account))")
    public void beforeAddAccountAdvice4() {
        System.out.println("\n======>>> Executing @Before advice on method addAccount()");
    }

}
