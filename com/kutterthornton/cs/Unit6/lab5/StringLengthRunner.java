package com.kutterthornton.cs.Unit6.lab5;

public class StringLengthRunner
{
    public static void main( String args[] )
    {
        // Create the scanner object
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        // Ask user to input a word 1
        System.out.print("Enter a word :: ");
        String word1 = keyboard.nextLine();

        // Ask user to input a word 2
        System.out.print("Enter a word :: ");
        String word2 = keyboard.nextLine();

        // Create the object and run methods for desired output
        StringLengthCheck test = new StringLengthCheck(word1, word2);
        System.out.println(test);
        test.checkLength();


    }
}
