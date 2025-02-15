package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "atulchandel@gmail.com";
        String[] str1 =str.split("@");
        String[] str1a = new String[]{str1[0]};
        String[] str2 =str1[1].split("\\.");
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        String[] combined = Stream.concat(Arrays.stream(str1a), Arrays.stream(str2)).toArray(String[]::new);
        System.out.println(Arrays.toString(combined));
    }
}
