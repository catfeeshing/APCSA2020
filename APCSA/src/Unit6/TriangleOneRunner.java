package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name Carolyn Cui
//Date 2/13/20

import static java.lang.System.*;

public class TriangleOneRunner {
	public static void main(String[] args) {
		// add test cases
		TriangleOne word = new TriangleOne();
		
		word.setWord("hippo");
		word.print();
		System.out.println("\n\n");
		
		word.setWord("abcd");
		word.print();
		System.out.println("\n\n");
		
		word.setWord("it");
		word.print();
		System.out.println("\n\n");
		
		word.setWord("a");
		word.print();
		System.out.println("\n\n");

		word.setWord("chicken");
		word.print();
		System.out.println("\n\n");
	}
}