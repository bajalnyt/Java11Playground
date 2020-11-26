package com.mohbajal.leetcode.ThirtyDayChallenge;

import java.util.ArrayList;
import java.util.List;

public class StringBackSpace {


    public static void main(String[] args) {
        System.out.println(compareStrings("a##c",  "#a#c"));
    }

    private static boolean compareStrings(String S, String T) {

        return getFullString(S).equalsIgnoreCase(getFullString(T));

    }

    private static String getFullString(String S) {
        StringBuilder s = new StringBuilder();
        char[] chars = S.toCharArray();
        for (int i = 0; i< S.length(); i++){
            if(chars[i] != '#'){
                s.append(chars[i]);
            } else {
                if(s.length()>0)
                s.deleteCharAt(s.length()-1);
            }
        }
        return s.toString();
    }
}
