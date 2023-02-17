package com.kutterthornton.Unit6.lab8;

import static java.lang.System.*;

public class WordFun2
{
    public static String moveEmAround(String a, int x)
    {
        // Checks to see if there is enough letters to move the first x characters to the end
        if (x > a.length()) {
            // If there is not enough letters, return "no can do"
            return "no can do";
        } else {
            // Move the first x characters to the end of the string
            String newString = a.substring(x) + a;

            // Return the concatenation of the second string and the first string
            return  newString;
        }

    }
}