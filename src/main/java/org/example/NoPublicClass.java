package org.example;

class A {
    void print(){
        System.out.println("Hello from A");
    }
    private class Atest{
        void print() {
            System.out.println("Hello from A");
        }
    }
}

class B {
    static void print(){
        System.out.println("Hello from B");
        A a = new A();
      //  a.Atest atest = new Atest();
    }
}
class NoPublic {
    public static void main(String[] args) {
        System.out.println("Hello from NoPublic");
        C.main(new String[]{"test"});
    }
}
class C {
    static void print(){
        System.out.println("Hello from C");
    }

    public static void main(String[] args) {
        A a = new A();
        a.print();
        B.print();
        print();
    }
}