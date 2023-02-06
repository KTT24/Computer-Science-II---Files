package com.kutterthornton.cs.Unit4.lab2;

public class Circle
{
    private double radius;
    private double area;

    public Circle()
    {
        radius = 0;
        area = 0;
    }


    public void setRadius(double rad)
    {
        radius = rad;
        area = Math.PI * radius * radius;
    }

    public double calculateArea()
    {
        return area;
    }


    public String toString( )
    {
        return "";
    }
}
