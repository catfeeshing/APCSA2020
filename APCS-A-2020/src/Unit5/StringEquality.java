package Unit5;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 2/11/20
//Class - AP CS A
//Lab  - StringEquality

import static java.lang.System.*;

public class StringEquality {
	private String wordOne, wordTwo;
	private boolean check;

	public StringEquality() {
		setWords("a", "b");
		wordOne = "a";
		wordTwo = "b";
	}

	public StringEquality(String one, String two) {
		setWords(one, two);
		wordOne = "a";
		wordTwo = "b";
	}

	public void setWords(String one, String two) {

		wordOne = one;
		wordTwo = two;

	}

	public boolean checkEquality() {
		check = wordOne.equals(wordTwo);
		return check;
	}

	public String toString() {

		if (check == false) {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}

		if (check == true) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		return "n/a";
	}
}