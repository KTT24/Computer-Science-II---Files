package com.kutterthornton.Unit11.lab2;

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotaller
{
    private String line;

    public LineTotaller()
    {
        line = "";
    }

    public LineTotaller(String s)
    {
        this.line = s;
    }

    public void setLine(String s)
    {
        this.line = s;
    }

    public int getSum()
    {
        // If the current character is a digit and the next character is a digit then combine them into a single number like 1 nad 2 into 12
        // If the current character is a space then skip it
        // If the current character is negative then make it positive

        int sum = 0;
        String[] numbers = line.split(" ");
        for (String number : numbers) {
            if (number.length() > 0) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;



    }

    public String getLine()
    {
        return line;
    }

    public String toString()
    {
        return getLine();
    }
}
