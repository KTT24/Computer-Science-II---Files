package com.kutterthornton.Unit9.Lab3;

public class DigitMath
{
    private static int countDigits( int number )
    {
        // Count the number of digits in number and return the number of digits
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;

    }

    private static int sumDigits( int number )
    {
        // Sum the digits in number and return the sum
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static double averageDigits( int number )
    {
        // Return the average of the digits in number
        return (double) sumDigits(number) / countDigits(number);
    }
}
