package com.kutterthornton.cs.Unit6.lab2;

import static java.lang.System.*;

public class StringEquality
{
    private String wordOne, wordTwo;

    public StringEquality()
    {
        wordOne = "";
        wordTwo = "";
    }

    public StringEquality(String one, String two)
    {
        wordOne = one;
        wordTwo = two;
    }

    public void setWords(String one, String two)
    {
        wordOne = one;
        wordTwo = two;
    }

    public boolean checkEquality( )
    {
        return wordOne.equals(wordTwo);
    }

    public String toString()
    {
        if(checkEquality() == true) {
            return wordOne + " has the same letters as " + wordTwo;
        } else {
            return wordOne + " does not have the same letters as " + wordTwo;
        }
    }
}
