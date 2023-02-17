package com.kutterthornton.Unit4.lab4;


public class Fahrenheit
{
    private double fahrenheit;
    private double celsius;

    public Fahrenheit()
    {
        fahrenheit = 0;
    }


    public void setFahrenheit(double fahren)
    {
        fahrenheit = fahren;
    }

    public double getCelsius()
    {
        //add code to convert fahrenheit to celsius
        celsius = (fahrenheit - 32) * 5 / 9;

        return celsius;

    }

    public String toString()
    {
        return String.format("%.2f degrees Fahrenheit == %.2f degrees Celsius", fahrenheit, getCelsius());

    }
}
