package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 2/10/20
//Class - AP CS A
//Lab  - Add Sub Mult

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		
		if (a > b) {
			return a - b;
		}
		
		else if (b > a) {
			return b - a;
		}
		
		else if (a == b ) {
			return a * b;
		}
		return 0;
		
	}
}