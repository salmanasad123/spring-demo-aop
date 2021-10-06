package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        // getting membership bean
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        // call the business method on that component, accountDAO will container our business logic
        accountDAO.addAccount();

        // call addAccount() method on membershipDAO object
        membershipDAO.addAccount();

        accountDAO.addAccount2(new Account());

        accountDAO.addAccount3(new Account(), true);

        // close the context
        context.close();
    }
}
