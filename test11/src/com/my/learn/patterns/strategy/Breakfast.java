package com.my.learn.patterns.strategy;

public class Breakfast implements Activity{

    @Override
    public void doAction() {
        System.out.println("I'm having breakfast");
    }
}
