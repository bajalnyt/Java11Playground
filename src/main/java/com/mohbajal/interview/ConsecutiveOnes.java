package com.mohbajal.interview;

import java.io.*;
import java.util.*;

/*
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */

class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,0,0,0};
        assert findMaxConsecutiveOnes(arr) == 3;
        System.out.println("well done!");
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 1){

            }
        }

        return 3;
    }
}