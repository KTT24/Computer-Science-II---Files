package com.kutterthornton.Unit9.Lab7;

import java.util.Scanner;


public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String sentence = keyboard.nextLine();
        System.out.print("Enter a letter to remove: ");

        char letter = keyboard.next().charAt(0);
        LetterRemover remover = new LetterRemover(sentence.toLowerCase(), letter);
        System.out.println(remover);

	}
}
