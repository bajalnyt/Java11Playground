package com.mohbajal.leetcode;

public class LinkedListToNumber {

    public static int getDecimalValue(ListNode head) {
        ListNode l1 = head;
        int decval=0, pos=0;
        while(l1!=null){
            l1 = l1.next;
            pos++;
        }
        l1=head;
        while(l1!=null){
            pos--;
            decval += l1.val * Math.pow(2,pos);
            l1 = l1.next;
        }
        return decval;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(1);

        l1.next = l2;
        l2.next=l3;
        System.out.println(getDecimalValue(l1));

    }
}

