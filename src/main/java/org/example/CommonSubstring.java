package org.example;

public class CommonSubstring {
    public static void main(String[] args) {
        String str1 = "atulkumarchandel";
        String str2 = "abckumarcdef";
        int min =0, max=0;
        for(int i =0; i<str2.length(); i++){
            for(int j=i+1; j<str2.length(); j++){
                String substr = str2.substring(i,j);
                if(str1.contains(substr) && (j-i) > (max-min)){
                    max = j;
                    min = i;
                }
            }
        }
        System.out.println(str2.substring(min,max));
    }
}
