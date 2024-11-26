package org.example;
class test{
    int a;
    static String s;
    static void update(){
        s="test";
    }
    void update1(){
        s="odi";
    }
}
public class HelloWorld {

    public static void main(String[] args) {
        int a;
        String s;
        test t = new test();
        test t2 = new test();
        t.update1();
        t2.update();
        System.out.println("t.s->"+ t.s);
        System.out.println("t2.s->"+ t2.s);
        test.s="constant";
        System.out.println("t.a->"+ t.a);
        System.out.println("t.s->"+ t.s);
        test.s="updated";
        System.out.println("test.s->"+ test.s);
        System.out.println("t2.s->"+ t2.s);
        //System.out.println("Hello World"+ s + a);
    }
}
