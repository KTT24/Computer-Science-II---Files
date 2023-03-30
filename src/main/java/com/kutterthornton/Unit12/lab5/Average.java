package com.kutterthornton.Unit12.lab5;

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
    private String line;

    //write two constructors

    public Average()
    {
        line = "";
    }

    public Average(String s)
    {
        line = s;
    }

    //write a setLine method

    public void setLine(String s)
    {
        line = s;
    }

    private int getLowest()
    {
        // find the lowest number one time and store it in a variable to be used in the getAverage method below
        Scanner scan = new Scanner(line);
        int lowest = scan.nextInt();
        int count = 0;
        while(scan.hasNextInt())
        {
            int num = scan.nextInt();
            if(num<lowest)
            {
                lowest = num;
                count++;
            }
        }
        return lowest / count;

    }

    public double getAverage()
    {
        // find the average of all the numbers in the line
        // but do not include the lowest number in the average
        // use the getLowest method to help you
        Scanner scan = new Scanner(line);
        int sum = 0;
        int count = 0;
        while(scan.hasNextInt())
        {
            int num = scan.nextInt();
            if(num!=getLowest())
            {
                sum+=num;
                count++;
            }
        }
        return (double)sum/count;
    }

    //write a getLine method

    public String getLine()
    {
        return line;
    }




    //write a toString method

    public String toString()
    {
        /*
            48 52 29 100 50 29 70 80 90 70
            average = 65.44
         */


        return String.format("%s\naverage = %.2f\n", line, getAverage());

    }





}
