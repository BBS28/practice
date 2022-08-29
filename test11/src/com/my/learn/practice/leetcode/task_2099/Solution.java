package com.my.learn.practice.leetcode.task_2099;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        List<Integer> subsequence = new LinkedList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            insertNumber(subsequence, nums[i], k);
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = subsequence.get(i);
        }
        return result;
    }

    private static void insertNumber(List<Integer> subsequence, int number, int k) {

        if (subsequence.size() < k) {
            subsequence.add(0, number);
        } else {
            Integer min = subsequence.get(0);

            for (int i = 1; i < subsequence.size(); i++) {
                if (subsequence.get(i) < min) {
                    min = subsequence.get(i);
                }
            }

            for (int i = 0; i < subsequence.size(); i++) {
                if (number > subsequence.get(i)) {
                    subsequence.remove(min);
                    subsequence.add(0, number);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-56,-214,-345,952,529,-294,-325,-924,-27,-41,716,-67,-65,-481};
        int[] subsequence = solution.maxSubsequence(nums, 5);
        for (int n : subsequence) {
            System.out.println(n);
        }

    }
}
