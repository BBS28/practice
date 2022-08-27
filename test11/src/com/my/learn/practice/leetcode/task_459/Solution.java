package com.my.learn.practice.leetcode.task_459;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean repeatedSubstringPattern(String s) {

        Set<String> substringSet = new HashSet<>();
        for (int i = 2; i <= s.length(); i++) {
            if (s.length() % i > 0) {
                continue;
            }
            substringSet.clear();
            int substringSize = s.length() / i;

            for (int j = 0; j < s.length(); j = j + substringSize) {
                substringSet.add(s.substring(j, j + substringSize));
            }
            if (substringSet.size() == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.repeatedSubstringPattern("ababab");
        System.out.println(result);
    }
}
