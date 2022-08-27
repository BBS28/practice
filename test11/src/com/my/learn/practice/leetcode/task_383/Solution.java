package com.my.learn.practice.leetcode.task_383;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        boolean flag = false;

        for (int i = 0; i < ransomNoteArray.length; i++) {
            if (!contains(ransomNoteArray[i], magazineArray)) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(char letter, char[] magazineArray) {
        for (int j = 0; j < magazineArray.length; j++) {
            if (letter == magazineArray[j]) {
                magazineArray[j] = 65;
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("aa", "ab"));
    }
}
