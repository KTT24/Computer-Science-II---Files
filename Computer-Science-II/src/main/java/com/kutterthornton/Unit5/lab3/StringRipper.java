package com.kutterthornton.Unit5.lab3;

import static java.lang.System.*;

public class StringRipper
{
    private String word;

    public StringRipper()
    {
        word = "";
    }

    public StringRipper(String s)
    {
        word = s;
    }

    public void setString(String s)
    {
        word = s;

    }

    public String ripString(int x, int y)
    {
        String ripped = word.substring(x,y);
        return ripped;
    }

    public String toString()
    {
        return word;
    }
}
