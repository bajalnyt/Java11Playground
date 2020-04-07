package com.mohbajal.leetcode;

public class ReduceToZero {

    public static void main(String[] args) {
        int num = 123;
        int count = 0;
        while(num!=0){
            if(num%2!=0){
                num--;
                count++;
            } else {
                num = num/2;
                count ++ ;
            }

        }

        System.out.println(count);
    }
}
