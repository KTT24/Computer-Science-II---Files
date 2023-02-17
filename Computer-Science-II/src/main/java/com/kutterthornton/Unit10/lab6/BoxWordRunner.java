package com.kutterthornton.Unit10.lab6;

import java.util.Scanner;

public class BoxWordRunner {
    public static void main(String[] args) {
        // Create scanner object
        Scanner keyboard = new Scanner(System.in);

        // Prompt user for box size
        System.out.print("Enter the size of the box: ");
        String word = keyboard.next();

        // Create box object
        BoxWord box = new BoxWord(word);

        // Print box
        System.out.println(box);
    }
}
