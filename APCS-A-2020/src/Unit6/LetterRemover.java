package Unit6;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name - Carolyn Cui
//Date 2/13/20

import static java.lang.System.*;

public class LetterRemover {
	private String sentence;
	private char lookFor;

	public LetterRemover() {
		setRemover("abc", 'a');
		sentence = "abc";
		lookFor = 'a';
	}

	// add in second constructor

	public void setRemover(String s, char rem) {
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters() {
		for (int i = 0; i < sentence.length() - 1; i++) {
			if (sentence.charAt(i) == lookFor) {
				return sentence.replace(lookFor, ' ');
			}
		}

		String cleaned = sentence;
		return cleaned;
	}

	public String toString() {
		return sentence + " - letter to remove " + lookFor;
	}
}