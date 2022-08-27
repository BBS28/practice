package com.my.learn;

public class Man implements HelloSayer, SecondHelloSayer{

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!, I,m " + HelloSayer.age);
    }

    @Override
    public int getAge() {
        return SecondHelloSayer.super.getAge();
    }
}
