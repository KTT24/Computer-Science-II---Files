package com.kutterthornton.Unit5.lab2;

import static java.lang.System.*;
import java.util.Scanner;

public class FirstRunner
{
    public static void main ( String[] args )
    {
        //add test cases
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word :: ");
        String word = keyboard.next();
        FirstAndLast test = new FirstAndLast(word);
        System.out.println(test.toString());

    }
}
