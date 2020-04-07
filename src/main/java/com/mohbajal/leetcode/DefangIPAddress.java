package com.mohbajal.leetcode;

public class DefangIPAddress {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println( address.replaceAll("\\.", "[.]"));
    }
}
