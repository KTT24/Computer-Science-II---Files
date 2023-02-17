package com.kutterthornton.Unit10.lab6;

public class BoxWord {
    private String word;

    public BoxWord()
    {
        word="";
    }

    public BoxWord(String s)
    {
        word=s;
    }

    public void setWord(String w)
    {
        word=w;
    }

    public String toString()
    {

        String output="";
        System.out.println(word);
        for (int i = 1; i < word.length() - 1; i++) {
            output += word.charAt(i);
            for (int j = 0; j < word.length() - 2; j++)
                output += " ";
            output += word.charAt(word.length() - (i + 1)) + "\n";
        }
        // reverse the word with string builder
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        output += sb.toString() + "\n";,
        return output;
    }
}
