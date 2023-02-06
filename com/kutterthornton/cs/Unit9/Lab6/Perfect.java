package com.kutterthornton.cs.Unit9.Lab6;

import static java.lang.System.*;

public class Perfect
{
    private int number;

	//add constructors
    public Perfect()
    {
        setNum(0);
    }

	//add a set method
    public void setNum(int num)
    {
        number = num;
    }

	public boolean isPerfect()
	{
        int sum = 0;
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }
        }
        return sum == number;
	}

	//add a toString
    public String toString()
    {
        return number + " is " + (isPerfect() ? "" : "not ") + "perfect.";
    }
	
}
