package com.kutterthornton.Unit11.lab5;

import java.util.Scanner;

public class LineBreakerRunner {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        LineBreaker test = new LineBreaker();

        System.out.print("Enter a line of text :: ");
        String line = keyboard.nextLine();

        System.out.print("Enter the line break :: ");
        int breaker = keyboard.nextInt();

        test.setLineBreaker(line, breaker);

        System.out.println(test);
    }
}
