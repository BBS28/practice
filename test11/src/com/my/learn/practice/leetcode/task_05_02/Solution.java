package com.my.learn.practice.leetcode.task_05_02;

public class Solution {
    public String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                String substring = s.substring(j, i + j);
                if (isPalindrome(substring)) {
                    return substring;
                }
            }
        }
        return "";
    }

    private boolean isPalindrome(String substring) {
        for (int i = 0; i < substring.length() / 2; i++) {
            if (substring.charAt(i) != substring.charAt(substring.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("ab"));
    }
}
