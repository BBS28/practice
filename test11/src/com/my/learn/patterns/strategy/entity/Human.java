package com.my.learn.patterns.strategy.entity;


import com.my.learn.patterns.strategy.Activity;

public class Human {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void process() {
        activity.doAction();
    }
}
