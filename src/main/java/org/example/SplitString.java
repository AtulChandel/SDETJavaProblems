package org.example;

public class SplitString {
        public int maxScore(String s) {
            int max=0;
            for(int i =1; i< s.length(); i++){
                int result = substr(s,i, s.length());
                //System.out.println("result is "+ result + "\n");
                if(result > max){
                    max =result;
                }
            }
            return max;
        }
        public int substr(String s, int index, int len){
            String leftStr = s.substring(0, index);
            String rightStr = s.substring(index, len);
            //System.out.println("leftStr :" + leftStr);
            //System.out.println("rightStr :" + rightStr);
            int count=0;
            for(int i =0; i< leftStr.length(); i++){
                if(leftStr.charAt(i)=='0'){
                    //System.out.println("count incremented");
                    count++;
                }
            }
            for(int i=0; i<rightStr.length(); i++){
                if(rightStr.charAt(i)=='1'){
                    //System.out.println("count incremented");
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
            SplitString obj = new SplitString();
        System.out.println(obj.maxScore("011101"));
    }
}
