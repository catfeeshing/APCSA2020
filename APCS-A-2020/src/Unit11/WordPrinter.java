package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printWord(String word, int times)
	{
		String w = word;
		int x = times;
		
		for (int i = 0; i < x; i++) {
			System.out.println(word);
		}
	}
}