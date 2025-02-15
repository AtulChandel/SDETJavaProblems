package org.example;

import javax.xml.transform.Source;

public class LargestofTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int largestNumber = a > b ? a : b;
        System.out.println("largest number is " + largestNumber);
    }
}
