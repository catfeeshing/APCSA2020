package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		distance = 0;
		hours = 0;
		minutes = 0;
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		distance = 0;
		hours = 0;
		minutes = 0;
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
		hours = minutes / 60;
		mph = (distance / hours);
	}

	public void print()
	{
		System.out.println("\n\n");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		String mphs = String.format("%.0f", mph);
		return "The average miles per hour in " + hours + " hours and " + distance + " miles is " + mphs;
	}
}