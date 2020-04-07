package com.mohbajal.leetcode;

public class BalancedString {

    public static void main(String[] args) {
        String  s = "RLRRRLLRLL";
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i=0; i< s.length(); i ++) {
            if(chars[i] == 'R' && i < s.length()-1) {
                if(chars[i+1] == 'L') {
                    count++;
                    i++;
                }
            } else if(chars[i] == 'L' && i < s.length()-1) {
                if(chars[i+1] == 'R') {
                    count++;
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
