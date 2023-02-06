package com.kutterthornton.cs.Unit5.lab4;

import static java.lang.System.*;

public class Name
{
    private String name;

    public Name()
    {
        name = "";
    }

    public Name(String s)
    {
        name = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public String getFirst()
    {
        return name.substring(0,name.indexOf(" "));
    }

    public String getLast()
    {
        return name.substring(name.indexOf(" ")+1);
    }

    public String toString()
    {
        return "First Name :: " + getFirst() + "\nLast Name :: " + getLast() + "\n" + name ;
    }
}