package com.my.learn.practice.row;

public class ComressRawApp {

    public static void main(String[] args) {
        String row = "22ADDDDEEfBBc";
        char[] chars = row.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        char currentChar = chars[0];
        int counter = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                counter++;
                continue;
            }

            if (counter != 1) {
                sb.append(counter);
            }
            sb.append(chars[i]);
            currentChar = chars[i];
            counter = 1;
        }

        if (counter != 1) {
            sb.append(counter);
        }

        System.out.println(sb);
    }
}
