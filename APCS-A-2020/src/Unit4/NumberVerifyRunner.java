package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		int num;
		
		// Sample Data 111
		
		num = 111;
		System.out.println("\n\n" + num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		
		// Sample Data 2000
		
		num = 2000;
		System.out.println("\n\n" + num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		
		// Sample Data -99
		
		num = -99;
		System.out.println("\n\n" + num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		
		// Sample Data 1111
		
		num = 1111;
		System.out.println("\n\n" + num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		
		// Sample Data -850
		
		num = -850;
		System.out.println("\n\n" + num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
	}
}