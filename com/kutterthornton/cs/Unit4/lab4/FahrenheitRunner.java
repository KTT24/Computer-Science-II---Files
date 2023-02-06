package com.kutterthornton.cs.Unit4.lab4;

import static java.lang.System.*;
import java.util.Scanner;

public class FahrenheitRunner
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the temperature :: ");
        double fahren = keyboard.nextDouble();

        //add test cases
        Fahrenheit test = new Fahrenheit();
        test.setFahrenheit(fahren);
        // test.getCelsius(); UN
        System.out.println(test);
    }
}
