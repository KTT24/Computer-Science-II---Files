package com.kutterthornton.cs.Unit5.lab5;

import static java.lang.System.*;

public class StringChecker
{
    private String word;

    public StringChecker()
    {
        word = "";
    }

    public StringChecker(String s)
    {
        word = s;
    }

    public void setString(String s)
    {
        word=s;
    }

    public boolean findLetter(char c) {
        // check to see if the char is in the String and return true or false
        return word.indexOf(c) != -1;

    }


    public boolean findSubString(String s)
    {
        // check to see if the String is in the String and return true or false
        if (word.indexOf(s) != -1) {
            return true;
        } else {
            return false;
        }

    }

    public String toString()
    {
        // return the String that is being checked
        return word;
    }
}