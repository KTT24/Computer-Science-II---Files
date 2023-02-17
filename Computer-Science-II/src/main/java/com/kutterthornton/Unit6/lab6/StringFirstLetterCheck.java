package com.kutterthornton.Unit6.lab6;

import static java.lang.System.*;

public class StringFirstLetterCheck
{
    String wordOne, wordTwo;

    public StringFirstLetterCheck()
    {
        // Default constructor
        wordOne = "";
        wordTwo = "";
    }

    public StringFirstLetterCheck(String one, String two)
    {
        // Constructor with parameters
        wordOne = one;
        wordTwo = two;
    }

    public void setWords(String one, String two)
    {
        // Set the words
        wordOne = one;
        wordTwo = two;
    }

    public boolean checkFirstLetter( )
    {
        // Check the first letter of each word
        return wordOne.charAt(0) == wordTwo.charAt(0);
    }

    public String toString()
    {
        if (checkFirstLetter() == true)
        {
            return wordOne + " has the same first letter as " + wordTwo + "\n";
        }
        else
        {
            return wordOne + " does not have the same first letter as " + wordTwo + "\n";
        }

    }
}
