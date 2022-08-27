package com.my.learn.practice.leetcode.task_02;

import java.math.BigInteger;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger number1 = new BigInteger("0");
        BigInteger number2 = new BigInteger("0");
        BigInteger position = new BigInteger("1");
        ListNode nextNode = l1;
        do {
            number1 = number1.add(position.multiply(BigInteger.valueOf(nextNode.val)));
            nextNode = nextNode.next;
            position = position.multiply(BigInteger.valueOf(10));
        } while (nextNode != null);

        position = new BigInteger("1");
        nextNode = l2;

        do {
            number2 = number2.add(position.multiply(BigInteger.valueOf(nextNode.val)));
            nextNode = nextNode.next;
            position = position.multiply(BigInteger.valueOf(10));
        } while (nextNode != null);

        BigInteger sum = number1.add(number2); // 807

        int counter = 0;
        BigInteger number = sum;

        do {
            number = number.divide(BigInteger.valueOf(10));
            counter++;

        } while (number.compareTo(BigInteger.valueOf(0)) > 0);

        number = sum;
        position = new BigInteger("10");

        int[] resultArray = new int[counter];

        for (int i = counter - 1; i >= 0; i--) {

            resultArray[i] = number.mod(position).intValue();
            number = number.divide(BigInteger.valueOf(10));
        }

        ListNode lastNode = new ListNode(resultArray[0]);
        if (resultArray.length > 1) {

            for (int i = 1; i < resultArray.length; i++) {
                System.out.println(lastNode.val);
                ListNode resultList = new ListNode(resultArray[i], lastNode);
                lastNode = resultList;
            }
        }

        return lastNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addTwoNumbers(new ListNode(9),
                new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))))));
    }
}

