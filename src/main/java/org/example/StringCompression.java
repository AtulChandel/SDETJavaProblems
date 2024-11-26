package org.example;

public class StringCompression {
    public static void main(String[] args) {
        String str ="aaabbvffdeegggggiijj";
        StringBuffer result = new StringBuffer();
        int count =1;
        for(int i=0; i<str.length();i++){
            if(i < str.length() -1 && str.charAt(i) == str.charAt(i+1) ){
                count++;
            }
            else{
                result.append(str.charAt(i));
                if(count!=1) {
                    result.append(count);
                }
                count=1;
            }
        }
        System.out.println("Compressed string is "+ result);
    }
}
