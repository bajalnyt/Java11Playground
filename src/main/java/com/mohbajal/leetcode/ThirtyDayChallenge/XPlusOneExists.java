package com.mohbajal.leetcode.ThirtyDayChallenge;

import java.util.HashMap;
import java.util.Map;

public class XPlusOneExists {

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,2};

        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }

        int ans=0;

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            int key = item.getKey();
            int value = item.getValue();
            if(map.containsKey(key + 1))
                ans = ans + value;
        }
        System.out.println(ans);
    }
}
