package org.example;

import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str=s.next();
        int i=0,j=str.length()-1;
        boolean flag=true;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(str+ " is palindrome");
        }
        else{
            System.out.println(str+ " is not palindrome");
        }
    }
}
