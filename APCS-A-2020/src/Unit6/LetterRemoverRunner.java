package Unit6;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name - Carolyn Cui
//Date 2/13/20

import static java.lang.System.*;

public class LetterRemoverRunner {
	public static void main(String args[]) {
		// add test cases
		LetterRemover s = new LetterRemover();

		String sentence = "I am Sam I am";
		char remove = 'a';

		s.setRemover(sentence, remove);
		System.out.println(s);
		System.out.println(s.removeLetters() + "\n\n");
		
		sentence = "ssssssssxssssesssssesss";
		remove = 's';

		s.setRemover(sentence, remove);
		System.out.println(s);
		System.out.println(s.removeLetters() + "\n\n");
		
		sentence = "qwertyqwertyqwerty";
		remove = 'a';

		s.setRemover(sentence, remove);
		System.out.println(s);
		System.out.println(s.removeLetters() + "\n\n");
		
		sentence = "abababababa";
		remove = 'b';

		s.setRemover(sentence, remove);
		System.out.println(s);
		System.out.println(s.removeLetters() + "\n\n");
		
		sentence = "abaababababa";
		remove = 'x';

		s.setRemover(sentence, remove);
		System.out.println(s);
		System.out.println(s.removeLetters());
		
		
	}
}