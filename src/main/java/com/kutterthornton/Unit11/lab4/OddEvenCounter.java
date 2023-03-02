package com.kutterthornton.Unit11.lab4;

import java.util.Scanner;


public class OddEvenCounter {
    private String line;

    public OddEvenCounter()
    {
        line = "";
    }

    public OddEvenCounter(String s)
    {
        this.line = s;
    }

    public void setLine(String s)
    {
        this.line = s;
    }

    public int getEvenCount()
    {
        int count = 0;

        Scanner oddScanner = new Scanner(line);

        while (oddScanner.hasNextInt()) {
            int number = oddScanner.nextInt();
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int getOddCount()
    {
        int count = 0;

        Scanner oddScanner = new Scanner(line);

        while (oddScanner.hasNextInt()) {
            int number = oddScanner.nextInt();
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public String toString( )
    {
        return line + "\neven count = " + getEvenCount() + "\nOdd count = " + getOddCount();
    }
}
