package com.kutterthornton.Unit8.lab8;

import java.util.Scanner;

public class FactorialRunner {
    public static void main ( String[] args )
    {
        // Create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // Ask the user for the starting number
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();


        // Create a Factorial object
        Factorial f = new Factorial(num);

        // Print the results
        System.out.println(f);

    }
}
