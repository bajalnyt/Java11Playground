package com.mohbajal.leetcode.ThirtyDayChallenge;
/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer,
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
public class BHappyNumber {

    public static boolean isHappy(int n) {
        if(n == 1) return true;
        int sum = n;
        while(sum % 10 != 0) {
            sum = getSumOfSquares(sum);
            System.out.println(sum);
        }

        return getFirstDigit(sum) == '1';
    }

    private static int getSumOfSquares(int n) {
        char[] chars = (n+"").toCharArray();
        int sum =0;
        for(char c: chars){
            sum = sum + Integer.parseInt(c+"")* Integer.parseInt(c+"");
        }
        return sum;
    }

    private static int getFirstDigit(int n) {
        char[] chars = (n+"").toCharArray();
        return chars[0];
    }


    public static void main(String[] args) {
        System.out.println(isHappy(70));
    }

}
