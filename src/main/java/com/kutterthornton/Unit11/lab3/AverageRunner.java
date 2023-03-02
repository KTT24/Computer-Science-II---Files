package com.kutterthornton.Unit11.lab3;

import java.util.Scanner;

public class AverageRunner {
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a line of text :: ");
        String val = keyboard.nextLine();

        Average test = new Average(val);
        System.out.println(val);
        System.out.println(test);

    }
}
