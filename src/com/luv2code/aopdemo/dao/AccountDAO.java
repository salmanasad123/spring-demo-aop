package com.luv2code.aopdemo.dao;


import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

// this class is our target object for AOP programming
@Component
public class AccountDAO {

    public void addAccount() {

        // we are not doing any hibernate work here just doing output
        System.out.println(getClass() + ": DOING MY DB WORK ADDING ACCOUNT");
    }

    // now our method addAccount accepts a parameter of Account type
    public void addAccount2(Account account) {
        System.out.println(getClass() + ": DOING MY DB WORK ADDING ACCOUNT");
    }

    public void addAccount3(Account account, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK ADDING ACCOUNT");
    }
}
