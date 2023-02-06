package com.kutterthornton.cs.Unit8.lab10;

import static java.lang.System.*;
import java.util.Scanner;

public class BoxRunner
{
    public static void main ( String[] args )
    {
        // Create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for a word
        out.print("Enter a word: ");
        String word = keyboard.next();

        // Create a Box object
        Box box = new Box(word);

        // Print the word
        box.print(word);
    }
}
