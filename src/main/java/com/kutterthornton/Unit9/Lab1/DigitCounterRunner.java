package com.kutterthornton.Unit9.Lab1;

import java.util.Scanner;

public class DigitCounterRunner {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Crete a DigitCounter object
        DigitCounter dc = new DigitCounter();

        // Display the number of digits in the number
        System.out.println(number + " contains " + dc.countDigits(number) + " digits");

    }
    
}
