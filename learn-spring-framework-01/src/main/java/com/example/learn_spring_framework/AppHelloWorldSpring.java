package com.example.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args){
        //1.Launch spring context
        var context =new AnnotationConfigApplicationContext(HelloWorldSpringConfiguration.class);
        //2.Configure the things we want spring to handle using configuration class
        //3.Retrieving the bean
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
    }

}
