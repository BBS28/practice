package com.my.learn;


public interface HelloSayer {
    static int age = 20;

    void sayHello(String name);

    static String getStar() {
        return "Star";
    }

    default int getAge() {
        return age;
    }

    private int nonStaticMethod() {
        return 0;
    }

}
