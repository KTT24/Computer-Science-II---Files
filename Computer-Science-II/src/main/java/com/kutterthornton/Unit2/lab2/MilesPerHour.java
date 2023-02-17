package com.kutterthornton.Unit2.lab2;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		mph = 0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs; 
		minutes = mins;
	}

	public void calcMPH()
	{
		double time;
		time = hours + (minutes / 60.0);
		mph = distance / time;
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes = " + Math.round(mph) + " MPH.");

	}
}