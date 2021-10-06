package com.luv2code.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;

// this is our spring configuration class, not using xml
// Spring AOP to use proxy while calling target objects
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.luv2code.aopdemo")  // scan these packages to find components
public class DemoConfig {

}
