package com.my.learn;

public interface SecondHelloSayer {
    static int age = 30;

    void sayHello(String name);

    default int getAge() {
        return age;
    }
}
