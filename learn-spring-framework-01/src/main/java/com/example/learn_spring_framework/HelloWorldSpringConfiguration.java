package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldSpringConfiguration {
    @Bean
    public String name(){
        return "Amogh" ;
    }
    @Bean
    public int age(){
        return 20 ;
    }
    @Bean
    public Person person(String ravi, int i){
        return new Person("Ravi",20);
    }
}
