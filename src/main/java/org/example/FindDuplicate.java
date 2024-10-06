package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string ");
        str = s.next();
        Set<Character> ch =new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(ch.contains(c)){
                System.out.println("Duplicate char is "+ c);
            }
            else{
                ch.add(c);
            }
        }

    }
}
