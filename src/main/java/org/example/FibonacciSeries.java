package org.example;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = s.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println(fibonacci(i)+ " ");
        }
    }

    static int fibonacci(int n){
        if(n==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
