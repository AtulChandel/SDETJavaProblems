package org.example;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        String str;
        char c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string ");
        str=s.next();
        System.out.println("Enter a character to count occurance ");
        c=s.next().charAt(0);
        int count=0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println(c+ " occured in "+ str+ " total "+ count+ " times");
    }
}
