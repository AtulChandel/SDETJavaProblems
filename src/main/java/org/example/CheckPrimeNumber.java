package org.example;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer ");
        n = s.nextInt();
        boolean isPrime=true;
        if (n <= 1) {
            isPrime = false;
        }
        for(int i =2; i<(n/2)+1; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+ " is a prime number");
        }
        else{
            System.out.println(n+ " is not a prime number");
        }
    }
}
