package com.kutterthornton.Unit9.Lab3;

import java.util.Scanner;

public class DigitMathRunner {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Crete a DigitMath object
        DigitMath dm = new DigitMath();

        // Display the average of the digits in the number
        System.out.println(number + " has a digit average of " + dm.averageDigits(number));
    }
    
}
