package com.kutterthornton.Unit4.lab3;

public class Line
{
    private int xOne,yOne, xTwo, yTwo;
    private double slope;

    public Line(int x1, int y1, int x2, int y2)
    {
        setCoordinates(x1, y1, x2, y2);
        slope = 0.0;
    }

    public void setCoordinates(int x1, int y1, int x2, int y2)
    {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
    }

    public double calculateSlope()
    {
        // Calc the slope of the line using the two points given and return the value
        // Slope = (y2-y1)/(x2-x1)
        slope = ( (double)yTwo - (double)yOne) / ((double)xTwo - (double)xOne);
        return slope;
    }



    public String toString()
    {
        // return the slope of the line as a String with one decimal place like 3.2

        return String.format("%.1f", slope);

    }
}
