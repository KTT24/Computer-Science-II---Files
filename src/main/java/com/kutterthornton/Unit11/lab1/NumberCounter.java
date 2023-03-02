package com.kutterthornton.Unit11.lab1;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberCounter
{
    private String line;

    public NumberCounter()
    {
        line = "";
    }

    public NumberCounter(String s)
    {
        this.line = s;
    }

    public void setNumbers(String s)
    {
        this.line = s;
    }

    public int getCount()
    {
       // count numbers in line but if there are more than 1 number in a row, only count it once
         // ex: 1234 has 4 numbers but only 2 digits
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                count++;
                while (i < line.length() && Character.isDigit(line.charAt(i))) {
                    i++;
                }
            }
        }
        return count;
    }

    public String getNumbers()
    {
        String nums = "";
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                nums += line.charAt(i);
            }
        }
        return nums;
    }

    public String toString()
    {
        return line + "\n" + "count = " + getCount();
    }
}