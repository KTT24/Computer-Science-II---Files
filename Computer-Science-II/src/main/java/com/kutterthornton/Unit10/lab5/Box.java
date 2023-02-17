package com.kutterthornton.Unit10.lab5;

import static java.lang.System.*;

public class Box
{
    private int size;

    public Box()
    {
        size = 0;
    }

    public Box(int count)
    {
        size = count;
    }

    public void setSize(int count)
    {
        size = count;
    }

    public int getSize()
    {
        return size;
    }

    public String toString()
    {
        String output = "";
        for (int i = 0; i < size; i++) {
            // loop and print the spaces before the letter
            for (int j = 0; j < size - i; j++) {
                output += "*";
            }
            for (int j = -1; j < i; j++) {
                output += "#";
            }
            output += "\n";
        }

        return output;
    }
}
