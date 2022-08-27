package com.my.learn.practice.leetcode.task_686;

public class Solution {
    public int repeatedStringMatch(String a, String b) {
        String testString = a;
        CharSequence bCharSequence = b.subSequence(0, b.length());

        for (int i = 0; i < b.length() / a.length() + 2; i++) {
            if (testString.contains(bCharSequence)) {
                return i + 1;
            }
            testString = testString.concat(a);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.repeatedStringMatch("abc", "cabcabca"));
    }
}
