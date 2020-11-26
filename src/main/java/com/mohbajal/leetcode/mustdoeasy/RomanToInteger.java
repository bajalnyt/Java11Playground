package com.mohbajal.leetcode.mustdoeasy;

import java.util.HashMap;
import java.util.Map;

/*

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

*/
public class RomanToInteger {


    public int romanToInt(String s) {
        final Map<Character, Integer> map =  new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] chars = s.toCharArray();
        int sum =0;

        for(int i=0;i<chars.length; i++) {
            if(i!= chars.length-1) {
                if (chars[i] == 'I' && chars[i + 1] == 'V') {
                    sum = sum + 4;
                    i++;
                    continue;
                }
                if (chars[i] == 'I' && chars[i + 1] == 'X') {
                    sum = sum + 9;
                    i++;
                    continue;
                }

                if (chars[i] == 'X' && chars[i + 1] == 'L') {
                    sum = sum + 40;
                    i++;
                    continue;
                }
                if (chars[i] == 'X' && chars[i + 1] == 'C') {
                    sum = sum + 90;
                    i++;
                    continue;
                }

                if (chars[i] == 'C' && chars[i + 1] == 'D') {
                    sum = sum + 400;
                    i++;
                    continue;
                }
                if (chars[i] == 'C' && chars[i + 1] == 'M') {
                    sum = sum + 900;
                    i++;
                    continue;
                }
            }
            sum = sum + map.get(chars[i]);
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }

}
