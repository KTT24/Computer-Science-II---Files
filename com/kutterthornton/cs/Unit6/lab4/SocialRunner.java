package com.kutterthornton.cs.Unit6.lab4;

import static java.lang.System.*;

public class SocialRunner
{
    public static void main( String args[] )
    {
        // Create a new Scanner object
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        // Prompt the user for a social security number
        out.print("Enter a social security number: ");

        // Read the user's input
        String input = keyboard.nextLine();

        // Create a new Social object
        Social social = new Social(input);

        // Print the result
        out.println(social);


    }
}
