package com.kutterthornton.Unit12.lab2;

import java.util.Scanner;

import static java.lang.System.*;

public class TheLine
{
    private String line;

    public TheLine()
    {
        line = "";
    }

    public TheLine(String s)
    {
        line = s;
    }

    public int getLargest()
    {
        int largest = 0;
        Scanner scan = new Scanner(line);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public String toString( )
    {
        return line + " - Largest == " + getLargest();
    }
}
