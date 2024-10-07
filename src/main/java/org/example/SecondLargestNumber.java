package org.example;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr={1,5,6,3,7,8,1,23,15,6,7,13,19,9};
        if (arr.length < 2) {
            System.out.println("Array does not have enough elements.");
            return;
        }
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>large){
                secondLarge=large;
                large=arr[i];
            }
            if(arr[i]>secondLarge && arr[i]<large){
                secondLarge=arr[i];
            }
        }
        System.out.println("Second largest number is "+ secondLarge);
    }
}
