package org.example;
interface SecondTester{
    int workerSalary=1100;
    public void work();
}
class Tester implements SecondTester{
    private int age;
    String name = "Atul";
    void updateName(String name){
        this.name = name;
    }
    void printName(){
        System.out.println("Name is " + name);
    }
    public void setAge(int Empage){
        age = Empage;
    }
    public void work(){
        System.out.println("This is implementation of work... and salary is " + workerSalary);
    }
}
public class ObjectOriented {
    public static void main(String[] args) {

        Tester obj = new Tester();
        obj.printName();
        obj.updateName("Anshul");
        obj.printName();
        Tester obj2 = new Tester();
        obj2.printName();
        obj.setAge(10);
        obj.work();
        obj2.work();
    }
}

