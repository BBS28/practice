package com.my.learn.practice.leetcode.task_283;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {

        int indexOfFirstZero = -1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                if (indexOfFirstZero < 0) {
                    indexOfFirstZero = i;
                }

            } else if (indexOfFirstZero >= 0) {
                nums[indexOfFirstZero] = nums[i];
                nums[i] = 0;
                i = indexOfFirstZero;
                indexOfFirstZero = -1;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {0, 1, 0, 3, 12, 0};
        solution.moveZeroes(arr);
    }

}
