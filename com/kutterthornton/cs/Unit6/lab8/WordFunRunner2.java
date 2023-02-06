package com.kutterthornton.cs.Unit6.lab8;

import java.util.Scanner;
import static java.lang.System.*;

public class WordFunRunner2
{
    public static void main( String args[] )
    {
        //Create Scanner object and read in user input
        Scanner keyboard = new Scanner(System.in);

        // Ask the user for a word
        out.print("Enter a word :: ");
        String word = keyboard.nextLine();

        // Ask the user for a number
        out.print("Enter a number :: ");
        int num = keyboard.nextInt();

        // Create a WordFun2 object
        WordFun2 test = new WordFun2();

        // Print out the new word
        System.out.println( test.moveEmAround(word,num) );
    }
}
