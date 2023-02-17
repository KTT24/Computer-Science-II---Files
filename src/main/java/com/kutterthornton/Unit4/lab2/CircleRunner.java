package com.kutterthornton.Unit4.lab2;

import static java.lang.System.*;
import java.util.Scanner;

public class CircleRunner
{
    public static void main( String[] args )
    {
        //add Scanner object here
        Scanner keyboard = new Scanner(System.in);
        //add test cases
        System.out.println("Enter the radius :: ");
        double radius = keyboard.nextDouble();


        Circle test = new Circle();
        test.setRadius(radius);


        System.out.println("The area is :: " + test.calculateArea());
    }
}
