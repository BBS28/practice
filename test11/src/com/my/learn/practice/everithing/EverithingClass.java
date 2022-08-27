package com.my.learn.practice.everithing;

public class EverithingClass {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;

       while (c < 1000) {
           c =a + b;
           System.out.println(c);
           a = b;
           b = c;
        }

    }
}
