package org.example;

public class Singleton {
    int a;
    private Singleton(){
        a =10;
    }

    public static void main(String[] args) {
        Singleton s = new Singleton();
        System.out.println(s.a);
        Singleton s2 = new Singleton();
        s.a =20;
        System.out.println(s2.a);
    }
}
