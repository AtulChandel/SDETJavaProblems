package org.example;

public class SwitchCondition {
    public static void main(String[] args) {
        String today = "Saturday";
        switch (today){
            case "Monday":
                System.out.println("Today is first day of week!!");
                break;
            case "Friday":
                System.out.println("Almost weekend!!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's weekend, time to celebrate!!");
                break;
            default:
                System.out.println("It is weekday!!");
                break;
        }
    }
}
