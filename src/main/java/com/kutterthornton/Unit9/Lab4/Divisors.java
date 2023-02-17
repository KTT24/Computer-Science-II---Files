package com.kutterthornton.Unit9.Lab4;

public class Divisors {
    private int number;

	public Divisors()
	{
        number = 0;
	}

	public Divisors(int num)
	{
        setNum(num);
	}

	public void setNum(int num)
	{
        number = num;
	}

	public String getDivisors()
	{
        String divisors = "";
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisors += i + " ";
            }
        }
        return divisors;

	}

	public String toString()
	{
		return ""+number + " has divisors " + getDivisors() + "\n";
	}
    
}
