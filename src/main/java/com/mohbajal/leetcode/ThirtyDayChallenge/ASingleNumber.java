package com.mohbajal.leetcode.ThirtyDayChallenge;

import java.util.HashSet;
import java.util.Set;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Input: [2,2,1]
Output: 1
 */
public class ASingleNumber {

    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int num: nums) {
            res ^= num;
        }
        return res;
    }
    public static void main(String[] args) {

        System.out.println( singleNumber(new int[] {2,2,4,4,5,6,1,1,5}) );
    }
}
