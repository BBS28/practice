package com.my.learn.patterns.strategy;

public class Sleep implements Activity{

    @Override
    public void doAction() {
        System.out.println("I'm sleeping");
    }
}
