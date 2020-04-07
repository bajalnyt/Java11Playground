package com.mohbajal.leetcode;

public class ReverseInt {

    public static void main(String[] args) {
        int number = 20;
        boolean isNegative = number < 0 ? true : false;
        if(isNegative){
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit
        }

        System.out.println( isNegative ? reverse*-1 : reverse );
    }
}
