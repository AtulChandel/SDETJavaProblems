package org.example;

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int temp = num, count = 0, res = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        temp = num;
        while (temp > 0) {
            int lastDigit = temp % 10;
            res += Math.pow(lastDigit, count);
            temp /= 10;
        }
        return res == num;
    }
}
