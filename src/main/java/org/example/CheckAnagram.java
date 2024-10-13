package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1, str2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string 1 ");
        str1 = s.next();
        System.out.println("Enter string 2 ");
        str2 = s.next();
        if(str1.length() != str2.length()){
            System.out.println("Strings are not anagrams");
            exit(0);
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
            freq2[str2.charAt(i) - 'a']++;
            }
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                System.out.println("Strings are not anagrams");
                return;
            }
        }
        System.out.println("Strings are anagrams");
    }
}
