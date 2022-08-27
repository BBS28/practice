package com.my.learn.practice.leetcode.task_03;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        char[] charsFromString = s.toCharArray();
        int length = 0;
        List<Character> subsequenceList = new ArrayList<>();

        for (int i = 0; i < charsFromString.length; i++) {
            if (subsequenceList.contains(charsFromString[i])) {
                if (length < subsequenceList.size()) {
                    length = subsequenceList.size();
                }
                i = i - (subsequenceList.size() - subsequenceList.indexOf(charsFromString[i])) + 1;
                subsequenceList.clear();
            }
            subsequenceList.add(charsFromString[i]);
        }

        return Math.max(length, subsequenceList.size());

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("dddddddd"));

    }

}
