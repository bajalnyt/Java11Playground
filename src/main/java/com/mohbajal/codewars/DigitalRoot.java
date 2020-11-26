package com.mohbajal.codewars;

public class DigitalRoot {
    public static int digital_root(int n) {

        int sum = getSumOfDigits(n);
        while(!isSingleDigit(sum))
            sum = getSumOfDigits(sum);
        return sum;
    }

    public static boolean isSingleDigit(int num) {
        return num/10==0;
    }

    public static int getSumOfDigits(int n) {
        int i, sum =0;
        while(n>0) {
            i = n%10;
            sum+=i;
            n= n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(456));
    }
}
