package com.kutterthornton.cs.Unit4.lab3;

import java.util.Scanner;
import static java.lang.System.*;

public class LineRunner
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the x1 :: ");
        int x1 = keyboard.nextInt();
        System.out.println("Enter the y1 :: ");
        int y1 = keyboard.nextInt();
        System.out.println("Enter the x2 :: ");
        int x2 = keyboard.nextInt();
        System.out.println("Enter the y2 :: ");
        int y2 = keyboard.nextInt();


        //add test cases
        Line test = new Line(x1, y1, x2, y2);
        test.calculateSlope();

        test.setCoordinates(x1, y1, x2, y2);

        //print the slope here - remember to use the toString() method


        System.out.println("The slope is :: " + test.toString());



    }
}
