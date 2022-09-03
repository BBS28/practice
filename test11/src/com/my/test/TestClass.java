package com.my.test;


import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true) {
            list.add("erger");
            if (list.size() % 1000 == 0) {
                System.out.println(list.size());
            }
        }

    }
}
