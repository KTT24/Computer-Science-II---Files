package com.kutterthornton.unit7.lab1;

import static java.lang.System.*;
import java.util.Scanner;

public class GradeCheck
{
    public static void main( String args[] )
    {
        // Create Scanner object and ask user to input two word string
        Scanner keyboard = new Scanner(System.in);

        // Ask user to input a word 1
        System.out.print("Enter a grade :: ");
        int grade = keyboard.nextInt();

        // Create object and run methods for desired output
        Grade test = new Grade(grade);
        out.println(test);

    }
}
