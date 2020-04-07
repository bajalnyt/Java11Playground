package com.mohbajal.leetcode.ThirtyDayChallenge;

public class CMaxSum {

    public static int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i: nums) {
            currentSum = currentSum + i;
            if(currentSum >= maxSum) {
                maxSum = currentSum;
            } else {
                //maxSum = Integer.MIN_VALUE;
                currentSum = 0;
            }
            System.out.println(currentSum + " " + maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { -2,1,-3,4,-1,2,1,-5,4 }));
        //System.out.println(maxSubArray(new int[] { 1,2,-3,4 }));
    }
}
