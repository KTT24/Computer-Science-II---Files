package com.kutterthornton.Unit8.lab6;

import java.util.Scanner;

public class LoopStatsRunner
{
    public static void main ( String[] args )
    {
        // Create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // Ask the user for the starting number
        System.out.print("Enter the starting number: ");
        int start = keyboard.nextInt();
        keyboard.next();

        // Ask the user for the ending number
        System.out.print("Enter the ending number: ");
        int end = keyboard.nextInt();

        // Create a LoopStats object
        LoopStats ls = new LoopStats(start, end);

        // Print the results
        System.out.println(ls);

    }
}
