package org.example;

public class LargestElementIn2DArray {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3}, {5,4,3}, {9,1,0}, {5,6,3}};
        int rowlen = arr.length;
        int collen = arr[0].length;
        int max=arr[0][0];
        for(int i=0; i<rowlen; i++){
            for(int j=0; j<collen; j++){
                if(max < arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Largest Element is " + max);
    }
}
