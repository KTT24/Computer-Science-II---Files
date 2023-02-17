package com.kutterthornton.Unit8.Lab5;

import static java.lang.System.*;
import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String choice="";
		do{
			out.print("Enter a word :: ");
			String word = keyboard.next();
			Word test = new Word(word);
			out.println(test);
			out.print("Do you want to enter more sample input? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}