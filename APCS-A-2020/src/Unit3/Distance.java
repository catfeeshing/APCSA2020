package Unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 2/5/20
//Class - AP CS A
//Lab  - Distance / class

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
		distance = 0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(xTwo - xOne,2) + Math.pow(yTwo - yOne,2));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println("\n\n");
	}
	
	//complete print or the toString

	public String toString()
	{
		
		//returns to 3 decimal places
		String dist = String.format("%.3f", distance); 
		
		return "The distance between (" + xOne + "," +yOne + ") and (" + xTwo + "," +yTwo + ") is " + dist;
	}
}