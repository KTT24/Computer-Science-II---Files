package com.kutterthornton.Unit8.Lab4;

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number = 0;
    stop = 0;
	}

	public MultTable(int num, int end)
	{
        number = num;
        stop = end;
	}

	public void setTable(int num, int end)
	{
        number = num;
        stop = end;
	}

	public void printTable( )
	{
        // Print the table
        System.out.println("multiplication table for " + number);
        for (int i = 1; i <= stop; i++) {
                //System.out.println( i + "      " + (number * i));
                System.out.printf( "%d %6d%n", i, (number * i));
        }
	}
}