package com.my.learn.practice.strategy;

public class Competition {
    public static void main(String[] args) {
        Sportsman ironMan = new Sportsman();
        ironMan.setAction(new Run());
        ironMan.executeAction();

        ironMan.setAction(new Jump());
        ironMan.executeAction();

        ironMan.setAction(new Swim());
        ironMan.executeAction();
    }
}
