package com.kutterthornton.Unit12.lab4;

import static java.lang.System.*;

public class Box
{
    private String let;
    private int size;

    // make two constructors

    public Box()
    {
        let = "";
        size = 0;
    }

    public Box(String let, int size)
    {
        this.let = let;
        this.size = size;
    }

    public String toString()
    {
        String output = "";
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                output += let;
            }
            output += "\n";
        }
        return output;
    }
}
