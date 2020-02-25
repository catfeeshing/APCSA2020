package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = 1;
		amount = 1;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}
	
	public void setVals(char c, int amt) {
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		
		// starting rows = amt, letter = starting character. total haraters looped = amt
		// rows decreases by one and next letter
		
		int amtOne = amount;
		int amtTwo = amount;
		char newLetter = letter;
		
		for (int a = amount; a > 0; a--) {
			
			for (int b = amtOne; b > 0; b--) {
				
				for (int c = amtTwo; c > 0; c--) {
					System.out.print(newLetter);
				}
				
				amtTwo = amtTwo - 1;
				
				newLetter = (char)(newLetter + 1);
				if (newLetter == '[') {
					newLetter = 'A';
				}
				System.out.print(" ");
			
			}
			
			newLetter = letter;
			amtTwo = amount;
			amtOne = amtOne - 1;
			
			System.out.println("");
			//System.out.print(letter);
			
			
		}
		
		// below is bad, prints vertically, stop \n'ing
		
		/*
		for (int a = amount; a > 0; a--) {
			for (int b = a; b > 0; b--) {
				for (int d = amount; d > 0; d--) {
					for (int c = b; c > 0; c--) {
						System.out.print(letter);
					}
					System.out.println("\n");
				}
				System.out.println("\n");
			}
		}
		*/
		
		String output="";
		return output;
	}
}