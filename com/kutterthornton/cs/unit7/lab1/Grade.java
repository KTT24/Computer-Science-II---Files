package com.kutterthornton.cs.unit7.lab1;

import static java.lang.System.*;

public class Grade
{
    private int numGrade;

    public Grade()
    {
        numGrade = 0;
    }

    public Grade(int grade)
    {
        numGrade = grade;
    }

    public void setGrade(int grade)
    {
        numGrade = grade;
    }

    public String getLetterGrade( )
    {
        if (numGrade >= 90 & numGrade <= 100) {
            return "A";
        } else if (numGrade >= 80 & numGrade < 90) {
            return "B";
        } else if (numGrade >= 75 & numGrade < 80)  {
            return "C";
        } else if (numGrade >= 70 & numGrade < 75) {
            return "D";
        } else {
            return "F";
        }
    }

    public String toString()
    {
        return numGrade + " is a " + getLetterGrade() + "\n";
    }
}
