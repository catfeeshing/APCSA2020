package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   private int numA;
   private int numB;
   private int numC;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		this.setNum(num);

	}

	public void setNum(int num)
	{

		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c) {
		int max = 1;
		numA = a;
		numB = b;
		numC = c;
	
			
			// division - loop through numbers and divide them to find the gcf
			// gcf cannot exceed 1
		
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

	public String toString()
	{
		String output="";
		
		if (greatestCommonFactor(numA, numB, numC) == 1) {
			for (int i = 1; i >= number; i++) {
				if ((numA^2 + numB^2) == (numC^2)) {
					
					
				
				}
			}
		}
		




		return output+"\n";
	}
}