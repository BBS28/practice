package com.my.learn.practice.leetcode.task_11;

public class Solution {

    public int maxArea(int[] height) {
        int volume = 0;

        for (int i = 0; i < height.length - 1; i++) {

            for (int j = i + 1; j < height.length; j++) {
                int tempVolume;
                int width = j - i;

                if (height[i] >= height[j]) {
                    tempVolume = height[j] * width;
                } else {
                    tempVolume = height[i] * width;
                }

                if (tempVolume > volume) {
                    volume = tempVolume;
                }
            }
        }
        return volume;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 2, 4, 3}));
    }
}
