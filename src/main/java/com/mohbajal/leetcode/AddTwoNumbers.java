package com.mohbajal.leetcode;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstNum = 0;
        int secondNum = 0;

        while (l1 != null) {
            firstNum += l1.val;
            l1=l1.next;
        }
        while (l2 != null) {
            secondNum += l2.val;
            l2 = l2.next;
        }
        System.out.println(firstNum);
        System.out.println(secondNum);

        return null;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next=new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next=new ListNode(4);

        new AddTwoNumbers().addTwoNumbers(l1, l2);
    }
}
