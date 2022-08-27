package com.my.learn.practice.stepik.task_1_8;

import java.util.Scanner;

public class NextEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input + 2 - input % 2);

//        int next = input + 1;
//        if (next % 2 == 0) {
//            System.out.println(next);
//        } else {
//            System.out.println(next + 1);
//        }

    }

}
