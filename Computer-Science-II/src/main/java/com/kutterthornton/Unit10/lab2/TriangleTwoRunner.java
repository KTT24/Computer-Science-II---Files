package com.kutterthornton.Unit10.lab2;

// ═══════════════════════════⟦ 𝝨 ⟧═════════════════════════════
//					  Kutter Thornton © 2023
//						All Rights Reserved
// ═══════════════════════════⟦ 𝝨 ⟧═════════════════════════════

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleTwoRunner
{
   public static void main( String args[] )
   {
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();

			//instantiate a TriangleTwo object
      		TriangleTwo tw = new TriangleTwo( value, big );
         	//call the toString method to print the triangle
			System.out.println( tw );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}

