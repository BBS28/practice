package com.my.learn.practice.leetcode.task_05;

public class Solution {
    public boolean isPalindrome(int x) {

        String data = Integer.toString(x);
        char[] chars = data.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {

            if (chars[i] != chars[chars.length - 1 - i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.isPalindrome(34566543);
        System.out.println(b);
    }
}
