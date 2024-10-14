package org.example;

public class MaximumOnes {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3}, {1,4,1}, {1,1,1}, {5,6,3}};
        int max=0,count,rind=0;
        int rowlen=arr.length;
        int collen=arr[0].length;
        for(int i=0; i<rowlen; i++){
            count=0;
            for(int j=0; j<collen; j++){
                if(arr[i][j]==1){
                    count++;
                }
                if(count>max){
                    max=count;
                    rind=i;
                }
            }
        }
        System.out.println("Maximum one's are in row "+ rind);
    }
}
