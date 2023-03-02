package com.kutterthornton.Unit11.lab2;

import java.util.Scanner;

public class LineTotallerRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a line of text :: ");
        String val = keyboard.nextLine();

        LineTotaller test = new LineTotaller(val);
        System.out.println(test);
        System.out.println("sum = " + test.getSum());
    }
}
