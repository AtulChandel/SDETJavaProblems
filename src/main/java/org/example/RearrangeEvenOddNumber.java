package org.example;

public class RearrangeEvenOddNumber {
    public static void swapNumbers(int [] arr){
        int left =0;
        int right =arr.length-1;
        while(left<right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 1, 9, 8};
        swapNumbers(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
