package com.kutterthornton.cs.Unit9.Lab5;

import java.util.Scanner;

public class ReverseNumberRunner {
    public static void main(String[] args) {

        // Create and scaner object
        Scanner scan = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        // Create a new ReverseNumber object
        ReverseNumber test = new ReverseNumber(num);

        // Print the reverse of the number
        System.out.println(test.getReverse());
    }
    
}
