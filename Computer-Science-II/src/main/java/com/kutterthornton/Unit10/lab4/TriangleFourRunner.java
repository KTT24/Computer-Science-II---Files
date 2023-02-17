package com.kutterthornton.Unit10.lab4;


import java.util.Scanner;

public class TriangleFourRunner {
    public static void main(String[] args) {
        // Create the scanner object
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for the size of the triangle
        System.out.print("Enter the size of the triangle: ");

        // Create the size variable
        int size = keyboard.nextInt();

        // Prompt the user for the letter
        System.out.print("Enter a letter: ");

        // Create the letter variable
        String letter = keyboard.next();

        // Create the TriangleThree object
        TriangleFour triangle = new TriangleFour(size, letter);

        // Print the triangle
        System.out.println(triangle.toString());
    }
}
