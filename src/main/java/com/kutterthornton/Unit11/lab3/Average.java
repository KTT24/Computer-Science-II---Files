package com.kutterthornton.Unit11.lab3;

//Take a group of numbers all on the same line and average the numbers. First, total up all of the numbers. Then, take the total and divide that by the number of numbers. Format the average to three decimal places.

public class Average
{
    private String line;

    public Average()
    {
        line = "";
    }

    public Average(String s)
    {
        this.line = s;
    }

    public void setLine(String s)
    {
        this.line = s;
    }

    public int getCount()
    {
        // If the current character is a digit and the next character is a digit then combine them into a single number like 1 nad 2 into 12
        // If the current character is a space then skip it
        // If the current character is negative then make it positive

        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                count++;
                while (i < line.length() && Character.isDigit(line.charAt(i))) {
                    i++;
                }
            }
        }
        return count;
    }


    public int getSum()
    {
        int sum = 0;
        String[] numbers = line.split(" ");
        for (String number : numbers) {
            if (number.length() > 0) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;

    }

    public double getAverage()
    {
        double average = 0.0;
        // find the average of the numbers in the line
        average = (double) getSum() / getCount();
        return average;
    }

    public String getLine()
    {
        return line;
    }

    public String toString()
    {
        // return the line formatted to have 3 decimal places
        return String.format("average = %.3f", getAverage());
    }
}
