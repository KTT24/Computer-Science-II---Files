package com.kutterthornton.Unit12.lab1;

import static java.lang.System.*;

public class OddOrEven
{
    //instance variables
    private int number;

    //constructor
    public OddOrEven(int num)
    {
        number = num;
    }

    //setter method
    public void setNum(int num)
    {
        number = num;
    }

    //method to return true if number is odd else return false
    public boolean isOdd( )
    {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    //build print string to return to Runner class
    public String toString()
    {
        if (isOdd() == true) {
            return number + " is odd.";
        } else {
            return number + " is even.";
        }
    }
}
