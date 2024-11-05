package org.example;

public class SumofArrayRecursion {
    public static void main(String[] args) {
        int arr[]={1,4,5,2,4,5,6,7,8};
        int len=arr.length;
        System.out.println("Sum of all element is " + sumofArray(arr,len));
    }

    static int sumofArray(int []arr, int len){
        if(len>0){
            return arr[len-1] + sumofArray(arr, len-1);
        }
        else{
            return 0;
        }
    }
}
