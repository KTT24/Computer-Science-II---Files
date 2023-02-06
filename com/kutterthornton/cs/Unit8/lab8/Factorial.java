package com.kutterthornton.cs.Unit8.lab8;

public class Factorial
{
    private int number;

    public Factorial()
    {
        // initialise instance variables
        number = 0;
    }

    public Factorial(int num)
    {
        // initialise instance variables
        number = num;
    }

    public void setNum(int num)
    {
        // initialise instance variables
        number = num;
    }

    public int getNum()
    {
        return number;
    }

    public long getFactorial( )
    {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public String toString()
    {
        return "factorial of " + getNum() + " is "+ getFactorial()+"\n";
    }
}
