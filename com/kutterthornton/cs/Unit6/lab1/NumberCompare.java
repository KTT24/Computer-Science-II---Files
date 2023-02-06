package com.kutterthornton.cs.Unit6.lab1;

public class NumberCompare
{
    private int one, two;

    public NumberCompare()
    {
        one = 0;
        two = 0;
    }

    public NumberCompare(int n1, int n2)
    {
        one = n1;
        two = n2;
    }

    public void setNums(int n1, int n2)
    {
        one = n1;
        two = n2;
    }

    public int getLargest()
    {
        if(one>two)
            return one;
        else
            return two;
    }

    public int getSmallest()
    {
        return Math.min(one, two);
    }

    public String toString()
    {
        return one + " -- " + two;
    }
}
