package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   //private int numA;
   //private int numB;
   //private int numC;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{

		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c) {
		int max = 0;
		int num = a;
		
		
		if (b < num) {
			num = b;
		}
		if (c < num) {
			num = c;
		}
		for(int i = 1; i < num; i++) {
			if (a % i == 0 && c % i == 0) {
				max = i;
			}
		}
		
		return max;
	}
	
			
			// division - loop through numbers and divide them to find the gcf
			// gcf cannot exceed 1
		/**
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				max = i;
			}
		}
		for (int i = 1; i <= max && i <= c; i++) {
			if (max % i == 0 && c % i == 0) {
				max = i;
			}
		}

		return max;
		
	}
	**/

	public String toString()
	{
		String output="";
		//num vars
		
		int a = 1;
		int b = 1;
		int c = 1;
		;
		//if (greatestCommonFactor(numA, numB, numC) == 1) {
			for (int d = 1; d < number; d++) {
				
				for (int e = 1; e < number; e++) {
				
					for (int f = 1; f < number; f++) {
						
						c = f;
						
						if ((a^2 + b^2) == (c^2)) {
							if ((a % 2 == 1 && b % 2 == 0) || (a % 2 == 0 && b % 2 == 1)) {
								if (b > a && greatestCommonFactor(a,b,c) == 1) {
									output = output + a + " " + b + " " + c + "\n\n";
								}
							}
						}
					}
				}
			}
		return output+"\n";
	}
}
