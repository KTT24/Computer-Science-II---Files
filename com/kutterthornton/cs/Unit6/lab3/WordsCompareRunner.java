package com.kutterthornton.cs.Unit6.lab3;

import java.util.Scanner;

public class WordsCompareRunner
{
    public static void main( String args[] )
    {
        // Create the scanner object
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for the first word
        System.out.print("Enter the first word :: ");
        String wordOne = keyboard.next();

        // Prompt the user for the second word
        System.out.print("Enter the second word :: ");
        String wordTwo = keyboard.next();

        // Create the WordsCompare object
        WordsCompare words = new WordsCompare(wordOne, wordTwo);

        // Compare the words
        words.compare();

        // Print the results
        System.out.println(words);


    }
}
