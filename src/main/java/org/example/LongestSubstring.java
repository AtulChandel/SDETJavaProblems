package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        str=s.next();
        int min=0, max=0;
        for(int i =0; i<str.length()-1; i++){
            Set<Character> sc = new HashSet<>();
            sc.add(str.charAt(i));
            for(int j=i+1; j<str.length(); j++){
                if(!sc.contains(str.charAt(j))){
                    sc.add(str.charAt(j));
                }
                else{
                    if((j-i) > (max-min)) {
                        min = i;
                        max = j;
                    }
                    break;
                }
            }
        }
        System.out.println("Longest substring is "+ str.substring(min,max));
    }
}
