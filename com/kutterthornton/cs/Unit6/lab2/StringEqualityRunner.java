package com.kutterthornton.cs.Unit6.lab2;

import java.util.Scanner;
public class StringEqualityRunner
{
    public static void main( String args[] )
    {
        // Create a scanner object and get user input
        Scanner keyboard = new Scanner(System.in);

        // Ask for word 1
        System.out.print("Enter a word :: ");
        String word1 = keyboard.next();

        // Ask for word 2
        System.out.print("Enter another word :: ");
        String word2 = keyboard.next();


        // Add test cases
        StringEquality test = new StringEquality(word1, word2);
        System.out.println(test);

    }
}
