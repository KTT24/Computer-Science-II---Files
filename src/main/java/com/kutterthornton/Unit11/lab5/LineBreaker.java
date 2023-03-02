package com.kutterthornton.Unit11.lab5;

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
    private String line;
    private int breaker;

    public LineBreaker()
    {
        this("",0);
    }

    public LineBreaker(String s, int b)
    {
        this.line = s;
        this.breaker = b;
    }

    public void setLineBreaker(String s, int b)
    {
        this.line = s;
        this.breaker = b;
    }

    public String getLine()
    {
        Scanner lineScanner = new Scanner(line);
        return lineScanner.nextLine();
    }

    public String getLineBreaker()
    {
        String output = "";
        int count = 0;

        Scanner lineBreakerScanner = new Scanner(line);
        while (lineBreakerScanner.hasNext()) {
            String word = lineBreakerScanner.next();
            if (count + word.length() > breaker) {
                output += "\n" + word + "";
                count = word.length() + 1;
            } else {
                output += word + "";
                count += word.length() + 1;
            }
        }
        return output;
    }

    public String toString()
    {
        return getLineBreaker();
    }
}
