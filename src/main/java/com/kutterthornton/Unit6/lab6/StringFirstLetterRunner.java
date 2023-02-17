package com.kutterthornton.Unit6.lab6;

import java.util.Scanner;

import static java.lang.System.*;

public class StringFirstLetterRunner
{
    public static void main( String args[] )
    {
        // Create the scanner object
        Scanner keyboard = new Scanner(in);

        // Prompt the user for the first word
        out.print("Enter the first word :: ");
        String wordOne = keyboard.next();

        // Prompt the user for the second word
        out.print("Enter the second word :: ");
        String wordTwo = keyboard.next();

        // Create a new StringFirstLetterCheck object
        StringFirstLetterCheck check = new StringFirstLetterCheck(wordOne, wordTwo);

        // Print the result
        out.println(check);

    }
}
