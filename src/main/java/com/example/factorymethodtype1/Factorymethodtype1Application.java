package com.example.factorymethodtype1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Factorymethodtype1Application {  
public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
    A a=(A)context.getBean("a");  
    a.msg();  
}  
}  