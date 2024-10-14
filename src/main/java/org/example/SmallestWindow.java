package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestWindow {
    public static void main(String[] args) {
        String str1, str2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string1 ");
        str1=s.next();
        System.out.println("Enter a string2 ");
        str2=s.next();
        if (str2.length() > str1.length()) {
            System.out.println("No valid window.");
            return;
        }
        Set<Character> sc = new HashSet<>();
        for(int i=0; i<str2.length(); i++){
            sc.add(str2.charAt(i));
        }
        int min=Integer.MAX_VALUE, start=0, end=0;
        for(int i=0; i<str1.length(); i++){
            int count=0;
            Set<Character> tempsc = new HashSet<>(sc);
            for(int j=i; j<str1.length(); j++){
                if(tempsc.contains(str1.charAt(j))){
                    count++;
                    tempsc.remove(str1.charAt(j));
                }
                if(count == sc.size()){
                    if(min > (j-i+1)){
                        min=j-i;
                        start=i;
                        end=j;
                    }
                    break;
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            System.out.println("No valid window.");
        }
        else {
            System.out.println("Resulted string is " + str1.substring(start, end + 1));
        }
    }
}
