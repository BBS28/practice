package com.my.learn.practice.lambda;

import java.util.Scanner;

public class LambdaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String y1 = scanner.next();
//        String y2 = scanner.next();
//        String y3 = scanner.next();
//        String y4 = scanner.next();
//        String y5 = scanner.next();
//        String y6 = scanner.next();
//        String y7 = scanner.next();

        Calculator calculator;
        calculator = (x1, x2, x3, x4, x5, x6, x7) -> ((x1 + x2 + x3 + x4 + x5 + x6 + x7).toUpperCase());


        System.out.println(calculator.concatinate("sdf", "fs", "fsd", "fds", "fds", "wer", "sdf"));

    }
}
