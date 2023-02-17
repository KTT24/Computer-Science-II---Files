package com.kutterthornton.Unit6.lab3;

import static java.lang.System.*;

public class WordsCompare
{
    private String wordOne, wordTwo;
    private int compare;

    public WordsCompare()
    {
        // Default constructor for WordsCompare
        wordOne = "";
        wordTwo = "";
        compare = 0;
    }

    public WordsCompare(String one, String two)
    {
        // Constructor for WordsCompare
        wordOne = one;
        wordTwo = two;
        compare = 0;
    }

    public void setWords(String one, String two)
    {
        // Set the words
        wordOne = one;
        wordTwo = two;
    }

    public void compare()
    {
        // Compare the words
        compare = wordOne.compareTo(wordTwo);
    }

    public String toString()
    {
        // Return the results
        if(compare < 0)
        {
            // Return wordOne comes before wordTwo
            return wordOne + " should be placed before " + wordTwo + "\n";
        }
        else
        {
            // Return wordTwo comes before wordOne
            return wordOne + " should be placed after " + wordTwo + "\n";
        }
    }
}
