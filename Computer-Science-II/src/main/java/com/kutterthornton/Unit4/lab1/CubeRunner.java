package com.kutterthornton.Unit4.lab1;

import static java.lang.System.*;
import java.util.Scanner;

public class CubeRunner
{
    public static void main( String[] args )
    {
        int side;
        //Add your scanner here
        Scanner keyboard = new Scanner(System.in);

        //Add your input here
        System.out.println("Enter the side length :: ");
        side = keyboard.nextInt();

        //Create a new Cube
        Cube test = new Cube();


        //Set the side
        test.setSide(side);

        //Print the surface area
        System.out.println("The area of the cube is :: " + test.calculateSurfaceArea());

    }
}
