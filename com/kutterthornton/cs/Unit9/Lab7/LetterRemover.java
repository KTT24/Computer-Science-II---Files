package com.kutterthornton.cs.Unit9.Lab7;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
        setRemover("", ' ');
	}

	//add in second constructor
    public LetterRemover(String s, char rem)
    {
        setRemover(s, rem);
    }
	
	
	public void setRemover(String s, char rem)
	{
        sentence = s;
        lookFor = rem;
	}

	public String removeLetters()
	{
        String cleaned=sentence;
        int loc = cleaned.indexOf(lookFor);
        while (loc > -1)
        {
            cleaned = cleaned.substring(0,loc) + cleaned.substring(loc+1);
            loc = cleaned.indexOf(lookFor); 
        }
        return cleaned;
	}

	public String toString()
	{
        return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}
