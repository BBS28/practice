package com.my.learn.practice.stepik.task_1_60;

import java.util.Scanner;

public class PercentageAGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String gradesLine = scanner.nextLine();

        String [] grades = gradesLine.split("\\s");

        double sum = 0;
        for (String grade : grades) {
            if (grade.equals("A")) {
                sum++;
            }
        }

        double percent = sum / grades.length;
        System.out.println(percent);

    }


}
