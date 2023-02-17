package com.kutterthornton.Unit10.lab7;

import java.util.Scanner;

public class TriangleFiveRunner {
    public static void main(String[] args) {
        // Create scanner object
        Scanner keyboard = new Scanner(System.in);

        // Prompt user for box size
        System.out.print("Enter a character: ");
        char letter = keyboard.next().charAt(0);
        System.out.print("Enter the amount of times to repeat: ");
        int amount = keyboard.nextInt();

        // make the char uppercase
        letter = Character.toUpperCase(letter);

        // Create box object
        TriangleFive box = new TriangleFive(letter, amount);


        box.setLetter(letter);

        // Print box
        System.out.println(box);
    }
}
