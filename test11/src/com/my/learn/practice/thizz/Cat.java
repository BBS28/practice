package com.my.learn.practice.thizz;

public class Cat {

    private String name;
    private int age;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Mars", 2);
        System.out.println(cat.name);
    }
}
