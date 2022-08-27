package com.my.learn.practice.leetcode.task_215;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }

        int index = nums.length - k;
        for (int i = 0; i <= index; i++) {
            if (i < index) {
                queue.poll();
            } else {
                return queue.poll();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(solution.findKthLargest(nums, 4));
    }

}
