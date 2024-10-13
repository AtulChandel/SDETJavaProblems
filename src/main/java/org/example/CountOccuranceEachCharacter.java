package org.example;

import org.w3c.dom.html.HTMLMapElement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CountOccuranceEachCharacter {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string ");
        str = s.next();
        Map<Character, Integer> mp = new HashMap<>();
        for(int i =0; i<str.length(); i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
            }
            else{
                mp.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entr : mp.entrySet()) {
            System.out.println(entr.getKey() + " occures " + entr.getValue() + " times");
        }
    }
}
