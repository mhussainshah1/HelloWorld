package com.company;

import java.util.Scanner;

public class Pay {

    public static void main(String[] args) {
        long employeeNumber;
        double rate;
        int hours;
        double total = 0.0;
        System.out.println("Enter employee Number =");
        Scanner keyboard = new Scanner(System.in);
        employeeNumber = keyboard.nextLong();
        
        System.out.println("Enter Rate = ");
        rate = keyboard.nextDouble();
        
        System.out.println("Enter hours");
        hours = keyboard.nextInt();

        if (hours > 60 | rate > 25) {
            System.out.println("According to the company’s rules, the maximum hours an employee can work \r\n" +
                               "per week is 60 hours, and the maximum hourly rate is $25.00 per hour");
            return;
        } else if(hours> 35) {
            double weeklyPay = rate * 35;

            int overtime  = hours - 35;
            double overtimePay = rate * 1.5 * overtime;
            total = overtimePay + weeklyPay;
        } else {
            total = rate * hours;
        }
        System.out.println("Employee = " + employeeNumber + " ,weekly pay = " + total);
    }
}

