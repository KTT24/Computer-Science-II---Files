package com.kutterthornton.Unit6.lab1;

import java.util.Scanner;

import static java.lang.System.*;

public class NumberCompareRunner
{
    public static void main( String args[] )
    {
        //Create Scanner object and get user input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a whole number :: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter another whole number :: ");
        int num2 = keyboard.nextInt();


        //Create object and get largest and smallest numbers
        NumberCompare test = new NumberCompare(num1, num2);
        out.println(test);
        out.println("largest == "+test.getLargest());
        out.println("smallest == "+test.getSmallest()+"\n\n");


    }
}
