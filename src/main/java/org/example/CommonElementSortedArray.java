package org.example;

public class CommonElementSortedArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};
        int[] brr={2,4,6,7,8,9,11,12,14};
        int[] crr={2,3,4,5,6,7,8,9};
        int alen=arr.length;
        int blen=brr.length;
        int clen=crr.length;
        int a=0,b=0,c=0;
        while(a<alen && b<blen && c<clen){
            if(arr[a]==brr[b] && brr[b]==crr[c]){
                System.out.println("Common element is " + arr[a]);
                a++;
                b++;
                c++;
            } else if (arr[a]<brr[b] && arr[a]<crr[c]) {
                a++;
            } else if (brr[b]<arr[a] && brr[b]<crr[c]) {
                b++;
            }
            else {
                c++;
            }
        }
    }
}
