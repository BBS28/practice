package com.my.learn.practice.leetcode.task_28;

public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        int searchedLength = haystackArray.length - needleArray.length;
        for (int i = 0; i <= searchedLength; i++) {
            int counter = 0;

            for (int j = 0; j < needleArray.length; j++) {
                if (haystackArray[i + counter] != needleArray[j]) {
                    counter = 0;
                    break;
                }
                counter++;
                if (counter == needleArray.length) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.strStr("a", "a"));
    }
}
