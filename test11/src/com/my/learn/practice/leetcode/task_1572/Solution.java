package com.my.learn.practice.leetcode.task_1572;

public class Solution {

    public int diagonalSum(int[][] mat) {

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            int secondIndex = mat.length - 1 - i;
            int main = mat[i][i];
            int second = mat[i][secondIndex];

            if (i != secondIndex) {
                sum += main + second;
            } else {
                sum += main;
            }
        }

            return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};

        int sum = solution.diagonalSum(arr);
        System.out.println(sum);
    }
}
