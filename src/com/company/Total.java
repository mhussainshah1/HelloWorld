package com.company;

import java.util.Scanner;

public class Total {

    public static void main(String[] args) {
        String name = "";
        double amount = 0.0;
        int taxCode = 0;
        double total = 0.0;
        double tax = 0.0;

        System.out.println("Enter Customer Name ");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();

        System.out.println("Enter Purchase amount ");
        amount = keyboard.nextDouble();

        System.out.println("Enter tax code");
        taxCode = keyboard.nextInt();

        if(taxCode == 0) {
            tax = 0;
        } else if(taxCode==1) {
            tax = amount*3/100;
        } else if(taxCode==2) {
            tax = amount*5/100;
        } else if(taxCode==3) {
            tax = amount*7/100;
        }
        total = amount + tax;

        System.out.println("customer’s name = " + name +
                " ,purchase amount = $" + amount +
                " ,sales tax = " + tax +
                " and total amount due = " + total);

        String formattedString = String.format("customer’s name = %s ,purchase amount = $ %.2d,"+
                " sales tax = %.2d and total amount due = %.2d %n", name, amount, tax, total);
        System.out.printf(formattedString);
    }
}
