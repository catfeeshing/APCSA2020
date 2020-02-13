package Unit5;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 2/11/20
//Class - AP CS A
//Lab  - WordsCompare/Dictionary

import static java.lang.System.*;

public class WordsCompare {
	private String wordOne, wordTwo;
	private int compare;

	public WordsCompare() {
		setWords("a", "b");
		wordOne = "a";
		wordTwo = "b";
		compare = 1;
	}

	public WordsCompare(String one, String two) {
		setWords(one, two);
		wordOne = "a";
		wordTwo = "b";
		compare = 1;
	}

	public void setWords(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public void compare() {
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString() {
		if (compare < 0) {
			return wordOne + " should be placed before " + wordTwo + "\n";
		} else {
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}