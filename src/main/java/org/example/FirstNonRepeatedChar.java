package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string ");
        str = s.next();
        Map<Character,Integer> c = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            if (c.containsKey(str.charAt(i))) {
                c.put(str.charAt(i), c.get(str.charAt(i)) + 1);
            } else {
                c.put(str.charAt(i), 1);
            }
        }
        for(int i=0; i<str.length(); i++){
            if(c.get(str.charAt(i))==1){
                System.out.println("Non repeating first element is "+ str.charAt(i));
                break;
            }
        }
    }
}
