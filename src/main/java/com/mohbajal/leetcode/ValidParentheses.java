package com.mohbajal.leetcode;


import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class ValidParentheses {
    public static boolean isValid(String s) {

        Stack<Character> chars = new Stack<>();
        for (char c: s.toCharArray()) {

            if(chars.isEmpty()) {}

            if(chars.pop() == '}' || chars.pop() == ']' || chars.pop() == ')') {
                return false;
            }
            chars.add(c);


        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }
}