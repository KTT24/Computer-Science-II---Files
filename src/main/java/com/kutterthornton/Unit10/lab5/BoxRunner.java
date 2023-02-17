package com.kutterthornton.Unit10.lab5;

import com.kutterthornton.Unit10.lab6.BoxWord;

import java.util.Scanner;

public class BoxRunner {
    public static void main(String[] args) {
        // Create scanner object
        Scanner keyboard = new Scanner(System.in);

        // Prompt user for box size
        System.out.print("Enter the word for the box: ");
        String word = keyboard.next();

        // Create box object
        BoxWord box = new BoxWord(word.toUpperCase());

        // Print box
        System.out.println(box);
    }
}
