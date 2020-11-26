package com.mohbajal.leetcode.ThirtyDayChallenge;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private int size;
    private int min;
    private int secondMin;
    private List<Integer> a = new ArrayList<>();

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        size = 0;
    }

    public void push(int x) {
        if (size <= 0) {
            secondMin = min;
            min = x;
        } else if (x < min) {
            if(secondMin!=x) secondMin = min;
            min = x;
        }
        a.add(x);
        size++;
        // System.out.println(x + " pushed into stack");
    }

    public void pop() {
        int elRemoved = a.get((size - 1));
        a.remove(size - 1);
        size--;
        if (elRemoved == min ) {
            if(min < secondMin)
                min = secondMin;
        }
        if(size == 1) {
            min = a.get(0);
        }


        // System.out.println(" popped from stack");
    }

    public int top() {
        return a.get(size - 1);
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512 );
        System.out.println(minStack);

        minStack.pop();
        System.out.println(minStack);
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack);
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack);
        System.out.println(minStack.getMin());


    }

    @Override
    public String toString() {
        return "MinStack{" +
                "top=" + size +
                ", a=" + a +
                '}';
    }
}
