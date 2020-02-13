package Unit3;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 2/5/20
//Class - AP CS A
//Lab  - Distance / Runner

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// sample data tests

		Distance distOne = new Distance();

		// 1 1 2 1

		System.out.print("Enter first coordinate x value: ");
		int a = keyboard.nextInt();

		System.out.print("Enter first coordinate y value: ");
		int b = keyboard.nextInt();

		System.out.print("Enter second coordinate x value: ");
		int c = keyboard.nextInt();

		System.out.print("Enter second coordinate y value: ");
		int d = keyboard.nextInt();

		distOne.setCoordinates(a, b, c, d);
		distOne.calcDistance();
		System.out.println(distOne);
		distOne.print();

		// 1 1 -2 2

		a = 1;
		b = 1;
		c = -2;
		d = 2;

		distOne.setCoordinates(a, b, c, d);
		distOne.calcDistance();
		System.out.println(distOne);
		distOne.print();

		// 1 1 0 0

		a = 1;
		b = 1;
		c = 0;
		d = 0;

		distOne.setCoordinates(a, b, c, d);
		distOne.calcDistance();
		System.out.println(distOne);
		distOne.print();

	}
}