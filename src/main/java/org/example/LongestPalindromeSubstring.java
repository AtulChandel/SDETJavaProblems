package org.example;

import java.util.Scanner;

public class LongestPalindromeSubstring {
    static boolean checkPalindrome(String s, int i, int j){
        boolean flag=true;
        while(i<j) {
            if (!(s.charAt(i) == s.charAt(j))) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        str = s.next();
        boolean chkPal;
        int min=0,max=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                chkPal=checkPalindrome(str, i, j);
                if(chkPal && (max-min)< (j-i)){
                    min = i;
                    max = j;
                }
            }
        }
        System.out.println("Longest palindromic substring is "+ str.substring(min, max+1));
    }
}
