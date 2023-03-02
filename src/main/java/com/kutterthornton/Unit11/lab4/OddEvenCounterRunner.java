package com.kutterthornton.Unit11.lab4;

import java.util.Scanner;

public class OddEvenCounterRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        OddEvenCounter test = new OddEvenCounter();

        System.out.print("Enter a line of text :: ");
        test.setLine(keyboard.nextLine());

        System.out.println(test);


    }
}
