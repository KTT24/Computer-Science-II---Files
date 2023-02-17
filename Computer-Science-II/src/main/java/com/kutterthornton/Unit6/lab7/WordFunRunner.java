package com.kutterthornton.Unit6.lab7;

import java.util.Scanner;

import static java.lang.System.*;

public class WordFunRunner
{
    public static void main( String args[] )
    {
        //Create Scanner object and ask user to input two word string
        Scanner keyboard = new Scanner(System.in);

        // Ask user to input a word 1
        System.out.print("Enter a word :: ");
        String wor1d = keyboard.nextLine();

        // Ask user to input a word 2
        System.out.print("Enter a word :: ");
        String word2 = keyboard.nextLine();

        String worldFinal = wor1d + " " + word2;

        //Create object and run methods for desired output
        WordFun test = new WordFun(worldFinal);
        out.println(test);
        test.makeUpper();
        out.println(test);
        test.addHyphen();
        out.println(test);

    }
}
