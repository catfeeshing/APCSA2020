package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover s = new LetterRemover();
		
		String sentence = "I am Sam I am";
		char remove = 'a';
		
		s.setRemover(sentence, remove);
		s.removeLetters();
		System.out.println(s);
	}
}