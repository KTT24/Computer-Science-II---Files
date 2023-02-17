package com.kutterthornton.Unit9.Lab5;

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	// create constructors
    public ReverseNumber() {
        number = 0;
    }

    public ReverseNumber(int num) {
        setNum(num);
    }

    // create a set method
    public void setNum(int num) {
        number = num;
    }


	public int getReverse()
	{
        int rev = 0;
        int num = number;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
	}

	//add  a toString	
    public String toString() {
        return "" + number + " is reversed to " + getReverse() + "\n";
	
    }
}
