package com.my.learn;

import java.util.Arrays;

public class Tester {


    public static void main(String[] args) {

        int searched = 8;

        int []arr = {2, 4, 5};

        System.out.println(Arrays.toString(getDigits(arr, searched)));

    }

    public static int[] getDigits(int[] arr, int searched) {

        int begin = 0;
        int end = arr.length - 1;

        while (begin != end) {
            int sum = arr[begin] + arr[end];

            if (sum == searched) {
                return new int[]{arr[begin], arr[end]};
            }

            if(sum < searched) {
                begin++;
            }

            if(sum > searched) {
                end--;
            }
        }
        return new int[0];
    }

}
