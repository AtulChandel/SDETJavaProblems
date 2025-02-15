package org.test;

class ExampleConstructor{
    public static void main(String[] args) {
      int []arr = {2,3,5,1}; //2+3+5+1 =11
      int lenarr = arr.length+1;
      int actualsum =0;
      int sum = (lenarr*(lenarr+1))/2; // (4*5)/ = 10
        for(int i =0; i<lenarr-1; i++){
            actualsum+=arr[i];
        }
        System.out.println(actualsum);
        System.out.println(sum);
        System.out.println(sum-actualsum);
    }
}



