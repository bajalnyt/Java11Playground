package com.mohbajal.firecode;

import java.util.HashMap;
import java.util.Map;

public class ArrayCount {

    public static int singleNumber(int[] A) {

        Map<Integer, Integer> counts = new HashMap<>();
        for(int i=0;i< A.length; i++){
            if(counts.get(A[i])!=null){
                counts.put(A[i],counts.get(A[i])+1);
            } else {
                counts.put(A[i],1);
            }
        }
        System.out.println(counts);
        for(int i:counts.keySet()){
            if(counts.get(i)==1)
                return i;
        }

        return 0;

    }
    public static void main(String[] args) {

        int[] A = new int[] {1,2,3,4,1,2,4,3,5};
        System.out.println(singleNumber(A));
    }
}
