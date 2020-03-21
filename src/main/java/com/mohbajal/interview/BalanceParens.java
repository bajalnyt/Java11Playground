package com.mohbajal.interview;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Stack;
/**
 * Given a string containing just the characters?'(', ')', '{', '}', '[' and 
 * ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 *
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 * Input: "()", Output: true
 *
 * Example 2:
 * Input: "()[]{}", Output: true
 *
 * Example 3:
 * Input: "(]", Output: false
 *
 * Example 4:
 * Input: "([)]", Output: false
 *
 * Example 5:
 * Input: "{[]}", Output: true
 *
 * Example 6: Input: "({)[}]", Output: False
 *
 */
public class BalanceParens {
    public boolean isValid(String str) {
        // TODO
        if (str == null) return true;

        Stack<Character> brBalance = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case '[':
                case '{':
                case '(':
                    brBalance.push(str.charAt(i));
                    break;
                case ']':
                    if (brBalance.isEmpty() || brBalance.pop() != '[') return false;
                    break;
                case '}':
                    if (brBalance.isEmpty() || brBalance.pop() != '{') return false;
                    break;
                case ')':
                    if (brBalance.isEmpty() || brBalance.pop() != '(') return false;
                    break;
                default:
                    ; // do nothing for now
            }
        }

        if (brBalance.isEmpty()) return true;

        return false;
    }

    @Test
    public void emptyStringOrNull() {
        assertTrue("Should be valid when empty or null", isValid(""));
        assertTrue("Should be valid when empty or null", isValid(null));
    }

    @Test
    public void validScenarios() {
        assertTrue("'()' should be valid", isValid("()"));
        assertTrue("'()[]{}' should be valid", isValid("()[]{}"));
        assertTrue("'{[()()][{}]}' should be valid", isValid("{[()()][{}]}"));
    }

    @Test
    public void invalidScenarios() {
        assertFalse("']' should be invalid", isValid("]"));
        assertFalse("'{' should be invalid", isValid("{"));
        assertFalse("'][' should be invalid", isValid("]["));
        assertFalse("'(]' should be invalid", isValid("(]"));
        assertFalse("'([)]' should be invalid", isValid("([)]"));
        assertFalse("'([)){[])' should be invalid", isValid("([)){[])"));
        assertFalse("'({)[}]' should be invalid", isValid("({)[}]"));
    }

    public static void main(String[] args) {
        JUnitCore.main("Solution");
    }
}