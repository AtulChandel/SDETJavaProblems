package org.example;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        int len = arr.length + 1;
        int sum = (len * (len + 1)) / 2;
        int actualSum = 0;
        for (int j : arr) {
            actualSum += j;
        }
        System.out.println("Missing number is " + (sum - actualSum));
    }
}
