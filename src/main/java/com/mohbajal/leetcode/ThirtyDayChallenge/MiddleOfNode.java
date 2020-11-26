package com.mohbajal.leetcode.ThirtyDayChallenge;

import com.mohbajal.leetcode.ListNode;

public class MiddleOfNode {

    private static ListNode findMiddle(ListNode head){

        ListNode node = head;
        int length = 0;
        while(node!=null) {
            node= node.next;
            length ++;
        }
        int mid = (length/2)+1;
        node = head;
        length = 0;
        while(node!=null) {
            length++;
            if(length == mid)
                return node;
            node= node.next;

        }
        return null;

    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
       // ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
      //  l5.next = l6;

        ListNode node = findMiddle(l1);
        while(node!=null) {
            System.out.println(node.val);
            node= node.next;
        }

    }
}
