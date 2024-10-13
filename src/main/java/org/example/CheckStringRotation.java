package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class CheckStringRotation {
    public static void main(String[] args) {
        String str1, str2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string1");
        str1=s.next();
        System.out.println("Enter a string2");
        str2=s.next();
        if(str1.length() != str2.length() || str1.isEmpty()){
            System.out.println(str2+" is not a string rotation of "+ str1);
            exit(0);
        }
        String str3=str1+str1;
        if(str3.contains(str2)){
            System.out.println(str2+" is a string rotation of "+ str1);
        }
        else{
            System.out.println(str2+" is not a string rotation of "+str1);
        }
    }
}
