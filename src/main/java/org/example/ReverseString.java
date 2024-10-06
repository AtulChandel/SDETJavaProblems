package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("Enter a string ");
        str = s.next();
        String revstr="";
        for(int i = str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            revstr += c;
        }
        System.out.println("Reversed string is "+ revstr);
        s.close();
    }
}
