package com.mohbajal.codewars;

import java.util.*;

public class Parentheses {

    public boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for(char c: braces.toCharArray()) {
            if (isOpeningParentheses(c)) {
                stack.push(c);
            } else if (isClosingParentheses(c)) {
                if (!stack.isEmpty() && doParenthesesMatch(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isOpeningParentheses(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    public boolean isClosingParentheses(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    public boolean doParenthesesMatch(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        System.out.println(new Parentheses().isValid("(({{[[]]}}))"));
    }
}
