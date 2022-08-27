package com.my.learn.practice.stepik.task_1_34;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.print("\t");

        for (int i = c; i <= d; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int i = a; i <= b; i++) {
            System.out.print(i + "\t");
            for (int j =c; j <= d; j ++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }


    }

}
