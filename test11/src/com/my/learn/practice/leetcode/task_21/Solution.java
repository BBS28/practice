package com.my.learn.practice.leetcode.task_21;

import com.my.learn.practice.leetcode.task_02.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode();
        listNode.next = solution.mergeTwoLists(new ListNode(1, new ListNode(3, new ListNode(3))), new ListNode(0, new ListNode(1, new ListNode(4))));
        while (listNode.next != null) {
            System.out.println(listNode.next.val);
            listNode = listNode.next;
        }
    }
}
