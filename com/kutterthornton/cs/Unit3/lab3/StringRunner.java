package com.kutterthornton.cs.Unit3.lab3;

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:: ");
        String a = input.next();

        System.out.println("Enter a string:: ");
        String b = input.next();

        System.out.println("Enter a string:: ");
        String c = input.next();

        //add test cases
        BiggestString bigString = new BiggestString(a, b, c);
        System.out.println(bigString);
        System.out.println("biggest = " + bigString.getBiggest() + "\n");

    }
}