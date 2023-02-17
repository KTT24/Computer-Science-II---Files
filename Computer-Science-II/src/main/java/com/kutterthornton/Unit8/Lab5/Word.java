package com.kutterthornton.Unit8.Lab5;

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length() - 1);
	}

	public String getBackWards()
	{
		// return the string backwards
		String back = "";
		for (int i = word.length() - 1; i >= 0; i--)
		{
			back += word.charAt(i);
		}
		return back;

	}

 	public String toString()
 	{
 		return word + "\n" + getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n";
	}
}