package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		// this was a test TriangleWord.printTriangle("cat");
		
		String ans = "y";
		
		Scanner input = new Scanner(System.in);
		
		while(ans.equals("y")) {
			System.out.print("Enter a word :: ");
			String word = input.next();
			TriangleWord.printTriangle(word);
			System.out.print("\nDo you want to enter more sample input? ");
			ans = input.next();
			System.out.println("");
		}
	}
}