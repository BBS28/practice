package com.my.learn.practice.builder;

public class BuilderTest {
    public static void main(String... args) {

        Human human = new Human.Builder()
                .buildName("John")
                .buildLastName("Smith")
                .buildEmail("smith@mail.com")
                .build();

        System.out.println(human);
    }
}
