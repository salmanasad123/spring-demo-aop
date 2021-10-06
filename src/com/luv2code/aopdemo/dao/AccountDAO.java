package com.luv2code.aopdemo.dao;


import org.springframework.stereotype.Component;

// this class is our target object for AOP programming
@Component
public class AccountDAO {

    public void addAccount() {

        // we are not doing any hibernate work here just doing output
        System.out.println(getClass() + ": DOING MY DB WORK ADDING ACCOUNT");
    }
}
