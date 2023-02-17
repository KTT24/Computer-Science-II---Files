package com.kutterthornton.Unit5.lab2;

import static java.lang.System.*;

public class FirstAndLast
{
    private String word;

    public FirstAndLast(String s)
    {
        word = s;
    }

    public void setString(String s)
    {
        word = s;
    }

    public String getFirst()
    {
        return word.substring(0,1);
    }

    public String getLast()
    {
        return word.substring(word.length()-1);
    }

    public String toString()
    {

        return "word :: " + word + " first letter :: " + getFirst() + " last letter :: " + getLast();
    }
}
