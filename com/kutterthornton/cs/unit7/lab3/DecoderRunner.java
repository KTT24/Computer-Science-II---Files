package com.kutterthornton.cs.unit7.lab3;

import static java.lang.System.*;
import java.util.Scanner;

public class DecoderRunner
{
    public static void main( String args[] )
    {
        // Create Scanner object and ask user to input two word string
        Scanner keyboard = new Scanner(in);

        // Ask user to input a word 1
        System.out.print("Enter a word :: ");
        char letter = keyboard.next().charAt(0);

        char letterFinal = Character.toUpperCase(letter);

        // Create object and run methods for desired output
        Decoder test = new Decoder(letterFinal);
        out.println(test);
    }
}