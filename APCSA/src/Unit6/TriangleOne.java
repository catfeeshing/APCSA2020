package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name Carolyn Cui
//Date 2/13/20

import static java.lang.System.*;

public class TriangleOne {
	private String word;

	public TriangleOne() {
		word = "a";
	}

	public TriangleOne(String s) {
		setWord(s);
		word = "a";
	}

	public void setWord(String s) {
		word = s;
	}

	public void print() {
	
		System.out.println(word);
		for (int i = word.length()-1; i > 0; i--) {
			System.out.println(word.substring(0,i));
		}
	}
}