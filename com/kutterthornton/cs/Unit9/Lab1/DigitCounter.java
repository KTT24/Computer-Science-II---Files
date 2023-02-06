package com.kutterthornton.cs.Unit9.Lab1;

public class DigitCounter {
    public static int countDigits( int number ) 
    {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
	}
}
