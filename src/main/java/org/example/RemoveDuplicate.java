package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6,7,4,6,8,9,2,1};
        Set<Integer> s = new HashSet<Integer>();
        for (int k : arr) {
            s.add(k);
        }
        int[] brr = new int[s.size()];
        int i=0;
        for(int v:s){
            brr[i++]=v;
        }
        System.out.println("Updated array is : ");
        for(int j=0; j<i; j++) {
            System.out.println(brr[j]);
        }
    }
}
