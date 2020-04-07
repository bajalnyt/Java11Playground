package com.mohbajal.leetcode;

public class NumbersSmallerthan {

    public static void main(String[] args) {
        int[] nums =  new int[] { 8,1,2,2,3 };

        int[] ans = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            int curCount=0;
            for(int j=0; j< nums.length; j++){
                if(i!=j && nums[i]> nums[j]) {
                    curCount++;
                }
            }
            ans[i] = curCount;
        }

        System.out.println(ans);
    }
}
