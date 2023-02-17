package com.kutterthornton.Unit9.Lab2;

import java.util.Scanner;

public class DigitAdderRunner {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Crete a DigitAdder object
        DigitAdder da = new DigitAdder();

        // Display the sum of the digits in the number
		System.out.println(da.sumDigits(number) + " is the sum of the digits " + number);
    }
}
