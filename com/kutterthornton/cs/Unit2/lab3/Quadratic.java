package com.kutterthornton.cs.Unit2.lab3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private double a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;

	}

	public Quadratic(double a, double b, double c)
	{
		setEquation(a, b, c);
		rootOne = 0;
		rootTwo = 0;
	}

	public void setEquation(double quadA, double quadB, double quadC)
	{
		quadA = a;
		quadB = b;
		quadC = c;

 	}

	public void calcRoots(double quadA, double quadB, double quadC )
	{
		rootOne = (quadB * -1 + Math.sqrt(quadB * quadB) - (4 * quadA * quadC) / (2 * quadA));
		rootTwo = (quadB * -1 - Math.sqrt(quadB * quadB) - (4 * quadA * quadC) / (2 * quadA));
	}

	public void print( )
	{
    System.out.printf("rootone ::  %.2f \n", rootOne);
    System.out.printf("roottwo ::  %.2f", rootTwo);
	}
}