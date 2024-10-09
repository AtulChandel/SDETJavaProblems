package org.example;

public class SumOfPairs {
    public static void main(String[] args) {
        int []arr={4,3,6,7,8,3,5,6,7,8,1,2,3};
        int sum = 12;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
    }
}
