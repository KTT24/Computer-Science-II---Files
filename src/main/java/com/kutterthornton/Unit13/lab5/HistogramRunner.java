package com.kutterthornton.Unit13.lab5;

import java.util.Scanner;

public class HistogramRunner
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // STEP 1: Ask the user for input
        System.out.println("Enter a string of numbers separated by a space \n" + "(e.g. 1 2 3 4 5 6 7 8 9)");
        System.out.print("Enter your numbers here: ");

        String numbers = input.nextLine();

        // STEP 2: Create an array of integers
        String[] numbersArray = numbers.split(" ");
        int[] intArray = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++)
        {
            intArray[i] = Integer.parseInt(numbersArray[i]);
        }
    }
}
