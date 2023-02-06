package com.kutterthornton.cs.Unit8.lab10;

import static java.lang.System.*;

public class Box
{
    private String word;

    public Box()
    {
        word = "";
    }

    public Box(String s)
    {
        word = s;
    }

    public void setWord(String s)
    {
        word = s;
    }

    public void print(String S)
    {
        // Output the word length() number of times.
        for (int i = 0; i < word.length(); i++)
        {
            out.print(word);
        }
    }
}
