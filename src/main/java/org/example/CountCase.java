package org.example;

public class CountCase {
    public static void main(String[] args) {
        String str = "Atul!#@!Chandel";
        int uprcase=0;
        int lwrcase=0;
        for (int i =0; i<str.length(); i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                uprcase++;
            }
            else if(str.charAt(i)>=97 && str.charAt(i)<=122){
                lwrcase++;
            }
        }
        System.out.println("upercase letters are "+ uprcase);
        System.out.println("lowercase letters are "+ lwrcase);
    }
}
