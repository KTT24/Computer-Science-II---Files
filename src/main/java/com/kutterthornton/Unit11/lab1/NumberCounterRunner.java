package com.kutterthornton.Unit11.lab1;

import java.util.Scanner;

public class NumberCounterRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NumberCounter test = new NumberCounter();
        System.out.print("Enter a line of text :: ");
        test.setNumbers(keyboard.nextLine());
        System.out.println(test);

    }
}
