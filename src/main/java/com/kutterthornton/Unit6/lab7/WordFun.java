package com.kutterthornton.Unit6.lab7;

import static java.lang.System.*;

public class WordFun
{
    private String word;

    public WordFun()
    {
        word = "";
    }

    public WordFun(String w)
    {
        word = w;
    }

    public void setWord(String w)
    {
        word = w;
    }

    public void makeUpper()
    {
        word = word.toUpperCase();
    }

    public void addHyphen()
    {
        word = word.replace(" ", "-");
    }

    public String toString()
    {
        return word;
    }
}
