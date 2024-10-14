package org.example;

import java.util.Scanner;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currmax=arr[0], max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < currmax+arr[i]){
                currmax= currmax+arr[i];
            }
            else{
                currmax=arr[i];
            }
            if(max < currmax){
                max=currmax;
            }
        }
        System.out.println("Maximum sum of subarray is "+ max);
    }
}
