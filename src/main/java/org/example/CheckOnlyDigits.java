package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class CheckOnlyDigits {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string ");
        str = s.next();
        boolean flag = true;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                flag=false;
            }
        }
        if(!flag){
            System.out.println("All are not digits");
        }
        else {
            System.out.println("All are digits");
        }
    }
}
