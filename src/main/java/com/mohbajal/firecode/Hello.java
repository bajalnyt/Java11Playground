package com.mohbajal.firecode;


import java.io.*;
import java.util.*;

//import static org.junit.Assert.*;

public class Hello {
    public static List<String> removeDupes(List<String> inputList) {
        // TODO
        List<String> outputList = new ArrayList<>();
        Set<String> mySet = new HashSet<>();
        for (String input : inputList) {
            mySet.add(input);
        }
        outputList.addAll(mySet);
        return outputList;
        //    return List.<String>of(mySet.toArray());
        //Collections.
        //outputList.addAll(mySet.toArray());
        //mySet.toArray()
        //return outputList;
    }

    public static void main(String[] args) {
//        JUnitCore.main("Solution");
    }

  //  @Test
    public void testRemovesDupes() {
    //    assertEquals(removeDupes(List.<String>of("one", "two", "two", "three")), List.<String>of("one", "two", "three"));
    }
}