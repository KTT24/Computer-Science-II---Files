package com.kutterthornton.cs.unit7.lab2;

import static java.lang.System.*;

public class HexToBinary
{
    private char hex;

    public HexToBinary()
    {
        hex = ' ';
    }

    public HexToBinary(char hexNum)
    {
        hex = hexNum;
    }

    public void setHex(char hexNum)
    {
        hex = hexNum;
    }

    public String getBinary()
    {
        // Convert hex to binary
        if (hex == '0') {
            return "0000";
        } else if (hex == '1') {
            return "0001";
        } else if (hex == '2') {
            return "0010";
        } else if (hex == '3') {
            return "0011";
        } else if (hex == '4') {
            return "0100";
        } else if (hex == '5') {
            return "0101";
        } else if (hex == '6') {
            return "0110";
        } else if (hex == '7') {
            return "0111";
        } else if (hex == '8') {
            return "1000";
        } else if (hex == '9') {
            return "1001";
        } else if (hex == 'A') {
            return "1010";
        } else if (hex == 'B') {
            return "1011";
        } else if (hex == 'C') {
            return "1100";
        } else if (hex == 'D') {
            return "1101";
        } else if (hex == 'E') {
            return "1110";
        } else if (hex == 'F') {
            return "1111";
        } else {
            return "Invalid hex digit";
        }

    }

    public String toString()
    {
        return hex + " is " + getBinary() + "\n";
    }
}
