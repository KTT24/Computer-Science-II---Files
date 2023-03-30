package com.kutterthornton.Unit12.lab1;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OddOrEvenRunner
{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("oddoreven.dat"));
        int size = file.nextInt();
        file.nextLine();
        for(int i = 0; i < size; i++)
        {
            // Find the number of data sets to process
            int num = file.nextInt();

            // Instantiate an OddOrEven
            OddOrEven test = new OddOrEven(num);

            // Call the toString() method to print the result
            System.out.print(test);
        }
    }
}
