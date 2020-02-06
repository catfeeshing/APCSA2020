package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 2/5/20
//Class - AP CS A
//Lab  - MPH / Runner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		MilesPerHour test = new MilesPerHour();

		// sample tests
		
		// 45 0 32
		
		System.out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		test.print();
		
		// 96 1 43
		
		dist = 96;
		hrs = 1;
		mins = 43;
		
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		test.print();
		
		// 100 2 25
		
		dist = 100;
		hrs = 2;
		mins = 25;
		
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		test.print();
		
		// 50 2 25
		
		dist = 50;
		hrs = 2;
		mins = 25;
		
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		test.print();
		
	}
}