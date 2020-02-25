package Unit5;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 2/11/20
//Class - AP CS A
//Lab  - StringEquality / Runner

import static java.lang.System.*;

public class StringEqualityRunner {
	public static void main(String[] args) {
		StringEquality string = new StringEquality();

		String wordA;
		String wordB;

		// test case 1: hello, goodbye

		wordA = "hello";
		wordB = "goodbye";

		string.setWords(wordA, wordB);
		string.checkEquality();
		System.out.println(string);

		// test case 2: one, two

		wordA = "one";
		wordB = "two";

		string.setWords(wordA, wordB);
		string.checkEquality();
		System.out.println(string + "\n\n");

		// test case 3: three, four

		wordA = "three";
		wordB = "four";

		string.setWords(wordA, wordB);
		string.checkEquality();
		System.out.println(string + "\n\n");

		// test case 4: TCEA, UIL

		wordA = "TCEA";
		wordB = "UIL";

		string.setWords(wordA, wordB);
		string.checkEquality();
		System.out.println(string + "\n\n");

		// test case 5: State, Champions

		wordA = "State";
		wordB = "Champions";

		string.setWords(wordA, wordB);
		string.checkEquality();
		System.out.println(string + "\n\n");

		// test case 6: ABC, ABC

		wordA = "ABC";
		wordB = "ABC";

		string.setWords(wordA, wordB);
		string.checkEquality();
		System.out.println(string + "\n\n");

		// test case 7: ABC, CBA

		wordA = "ABC";
		wordB = "CBA";

		string.setWords(wordA, wordB);
		string.checkEquality();
		System.out.println(string + "\n\n");

		// test case 8: Same, Same

		wordA = "Same";
		wordB = "Same";

		string.setWords(wordA, wordB);
		string.checkEquality();
		System.out.println(string + "\n\n");

	}
}