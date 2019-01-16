package com.company;

import java.util.Scanner;

public class Pay {

    public String calculate(long employeeNumber, double rate,  int hours) {
        double total;

        if (hours > 60 | rate > 25) {
            return "According to the company’s rules, the maximum hours an employee can work per week is 60 hours, and the \r\n" +
                    "maximum hourly rate is $25.00 per hour";
        } else if(hours> 35) {
            double weeklyPay = rate * 35;
            int overtime  = hours - 35;
            double overtimePay = rate * 1.5 * overtime;
            total = overtimePay + weeklyPay;
        } else {
            total = rate * hours;
        }
        return "Employee = " + employeeNumber +
                " ,weekly pay = " + total;
    }

    public static void main(String[] args) {
//        Pay p = new Pay();
//        System.out.println(p.calculate(1234567890L, 15, 10));
//        System.out.println(p.calculate(9876543210L, 15, 40));
        long employeeNumber;
        double rate;
        int hours;
        System.out.println("Enter employee Number =");
        Scanner keyboard = new Scanner(System.in);
        employeeNumber = keyboard.nextLong();
        
        System.out.println("Enter Rate = ");
        rate = keyboard.nextDouble();
        
        System.out.println("Enter hours");
        hours = keyboard.nextInt();
        
    }
}

