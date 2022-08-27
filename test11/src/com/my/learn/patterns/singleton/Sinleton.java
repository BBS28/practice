package com.my.learn.patterns.singleton;

public class Sinleton {
    private static Sinleton instance;
    private String name;

    private Sinleton() {
    }

    public static Sinleton getInstance(){
        if (instance == null) {
            instance = new Sinleton();
        }
        return instance;
    }

    public static void setInstance(Sinleton instance) {
        Sinleton.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
