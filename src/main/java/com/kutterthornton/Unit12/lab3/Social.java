package com.kutterthornton.Unit12.lab3;

import java.util.Scanner;

import static java.lang.System.*;

public class Social
{
    private String socialNum;

    public Social()
    {
        socialNum = "";
    }

    public Social(String soc)
    {
        socialNum = soc;
    }

    public void setSocial(String soc)
    {
        socialNum = soc;
    }

    public int getSum()
    {
        int sum = 0;
        Scanner sc = new Scanner(socialNum);
        sc.useDelimiter("-");
        for (int i = 0; i < socialNum.length(); i++)
        {
            sum += sc.nextInt();
        }
        return sum;
    }

    public String toString()
    {
        // SS# 22-11-22-11-22 has a sum of 88

        return "SS# " + socialNum + " has a sum of " + getSum();
    }
}
