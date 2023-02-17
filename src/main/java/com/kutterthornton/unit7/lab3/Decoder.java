package com.kutterthornton.unit7.lab3;

import static java.lang.System.*;

public class Decoder
{
    private char letter;

    public Decoder()
    {
        letter = ' ';

    }

    public Decoder(char let)
    {
        letter = let;
    }

    public void setLetter(char let)
    {
        letter = let;
    }

    public char deCode() {
        char result = 0;
        // decode the using LowerCase becomes UpperCase UpperCase becomes LowerCase Digits 0-9 become A-J Any other characters become #
        if (Character.isLowerCase(letter)) {
            result = Character.toUpperCase(letter);
        } else if (Character.isUpperCase(letter)) {
            result = Character.toLowerCase(letter);
        } else if (Character.isDigit(letter)) {
            result = (char) (letter + 17);
        } else {
            result = '#';
        }
        return result;
    }

    public String toString()
    {
        return letter + " decodes to " + deCode() + "\n";
    }
}
