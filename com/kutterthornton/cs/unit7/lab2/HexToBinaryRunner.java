package com.kutterthornton.cs.unit7.lab2;

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinaryRunner
{
    public static void main( String args[] )
    {
        // Create Scanner object and ask user to input two word string
        Scanner keyboard = new Scanner(System.in);

        // Ask user to input a word 1
        System.out.print("Enter a hex digit :: ");
        char hex = keyboard.next().charAt(0);


        // Create object and run methods for desired output
        HexToBinary test = new HexToBinary();
        test.setHex(hex);
        out.println(test);


    }
}
