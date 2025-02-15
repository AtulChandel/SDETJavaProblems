package org.example;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Chandel";
        StringBuffer str1 = new StringBuffer("Chandel");
        System.out.println(str1.reverse());
        StringBuilder str2 = new StringBuilder("Chandel");
        System.out.println(str2.reverse());
    }
}
