package com.kutterthornton.cs.unit7.lab4;

import java.util.Scanner;

import static java.lang.System.*;

public class MorseCodeRunner {
    public static void main(String args[]) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Ask for a letter
        System.out.println("Enter a letter: ");
        char letter = input.next().charAt(0);

        // Create MorseCode object
        MorseCode morse = new MorseCode(letter);
        out.println(morse);
    }
}
