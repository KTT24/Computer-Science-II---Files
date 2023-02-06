package com.kutterthornton.cs.Unit8.Lab4;

import java.util.Scanner;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		// Create the scanner object
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for number they are multiplying by
        System.out.print("Enter the number you want to multiply by: ");

        // Read the number
        int multiplyNumber = keyboard.nextInt();

        // Prompt the user for the number of rows in their table
        System.out.print("Enter the number of rows for your table: ");

        // Read the number
        int rowsNumber = keyboard.nextInt();

        // Create a new MultTable object
        MultTable table = new MultTable(multiplyNumber, rowsNumber);

        // Print the table
        table.printTable();
	}
}