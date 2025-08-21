package com.example.learn_spring_framework;

import org.springframework.stereotype.Component;

@Component("pacmanGame")
public class PacmanGame implements GamingConsole{

    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }

}