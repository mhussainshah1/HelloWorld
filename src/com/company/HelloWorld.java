package com.company;

import java.util.Scanner;

public class HelloWorld {
    /**
     * Java doc
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        String name = "Muhammad Shah";
        String employeeNum;
        System.out.println("Hello World" + name);
        //System.out.println(name);
        //single line comment
        /*
        * Multiline comment
         */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Employee Number ");
        employeeNum = keyboard.nextLine();
        System.out.println(employeeNum);
    }
}
