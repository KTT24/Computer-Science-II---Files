package com.kutterthornton.Unit8.lab9;


import java.util.Scanner;

public class TriangleOneRunner {
    public static void main ( String[] args )
    {
        // Create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // Ask the user for the starting number
        System.out.print("Enter a word: ");
        String word = keyboard.next();

        // Create a TriangleOne object
        TriangleOne t = new TriangleOne(word);

        // Print the results
        System.out.println(t);
    }
}
