package org.test;
class InvalidAge extends Exception{
    InvalidAge(String msg) {
        super(msg);
    }
}
public class CustomException {
    void validateAge(int age) throws InvalidAge{
        if(age < 18){
            throw new InvalidAge("Bacha abhi chota hai bhai!!!");
        }
        System.out.println("Age theek hai!!");
    }

    public static void main(String[] args) throws InvalidAge{
        int age =16;
        CustomException co = new CustomException();
        try{
          co.validateAge(age);
        }catch (InvalidAge e){
            System.out.println("Exception thrown " + e.getMessage());
        }
        try {
            if (age < 18) {
                throw new InvalidAge("Bacha abhi b chota hi hai!!");
            }
        }catch (InvalidAge e){
            System.out.println("Exception thrown " + e.getMessage());
        }
    }
}
