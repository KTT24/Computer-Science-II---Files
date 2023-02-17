package com.kutterthornton.Unit2.lab3;

import java.util.Scanner;

public class QuadraticRunner
{
	public static void main( String[] args )
   {
   	//add test cases
   	Scanner input = new Scanner(System.in);
   	
		System.out.println("Enter a :: ");
		double a = input.nextDouble();

		System.out.println("Enter b :: ");
		double b = input.nextDouble();

		System.out.println("Enter c :: ");
		double c = input.nextDouble();


    Quadratic quady = new Quadratic();
    quady.calcRoots(a, b, c);
    quady.print();
	}
}