package com.kutterthornton.cs.Unit6.lab4;

import static java.lang.System.*;

public class Social
{
    private String socialNum;
    private int sum;

    public Social()
    {
        // Default constructor
        socialNum = "";
        sum = 0;
    }

    public Social(String soc)
    {
        // Constructor
        socialNum = soc;
        sum = 0;
    }


    public void setWord(String w)
    {
        // Set the social number
        socialNum = w;
    }

    public int chopAndAdd()
    {
        // Chop up the social number and add the digits together and return the sum
        String[] parts = socialNum.split("-");
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }

    public String toString()
    {
        return "SS# " + socialNum + " has a total of " + chopAndAdd();
    }
}
