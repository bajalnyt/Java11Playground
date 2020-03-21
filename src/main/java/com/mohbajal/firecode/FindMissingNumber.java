package com.mohbajal.firecode;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {

    /*
    Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number.
    Assume you have 9 numbers between 1 to 10 and only one number is missing.
    */
    public static int findMissingNumber(int[] arr) {

        Set<Integer> s = new HashSet<>();
        for(int i=1;i<10; i++){
            s.add(i);
        }
        for (int value : arr) {
            s.remove(value);
        }
        return (int) s.toArray()[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5,6,7,8,9,10};
        System.out.println(findMissingNumber(arr));
    }
}
