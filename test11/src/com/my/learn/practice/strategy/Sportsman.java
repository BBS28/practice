package com.my.learn.practice.strategy;

public class Sportsman {
    private Action action;

    public Sportsman() {
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void executeAction() {
        action.doAction();
    }
}
