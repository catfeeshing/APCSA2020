package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 2/11/20
//Class - AP CS A
//Lab  - WordsCompare/Dictionary / Runner

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String[] args )
   {
		WordsCompare words = new WordsCompare();
		
		String wordA = "a";
		String wordB = "b";
		
		// test case 1: abe, ape
		
		wordA = "abe";
		wordB = "ape";
		
		words.setWords(wordA, wordB);
		words.compare();
		System.out.println(words + "\n\n");
		
		// test case 1: giraffe, gorilla
		
		wordA = "giraffe";
		wordB = "gorilla";
		
		words.setWords(wordA, wordB);
		words.compare();
		System.out.println(words + "\n\n");
		
		// test case 1: one, two
		
		wordA = "one";
		wordB = "two";
		
		words.setWords(wordA, wordB);
		words.compare();
		System.out.println(words + "\n\n");
		
		// test case 1: fun, funny
		
		wordA = "fun";
		wordB = "funny";
		
		words.setWords(wordA, wordB);
		words.compare();
		System.out.println(words + "\n\n");
		
		// test case 1: 123, 19
		
		wordA = "123";
		wordB = "19";
		
		words.setWords(wordA, wordB);
		words.compare();
		System.out.println(words + "\n\n");
		
		// test case 6: 192, 1910
		
		wordA = "193";
		wordB = "1910";
		
		words.setWords(wordA, wordB);
		words.compare();
		System.out.println(words + "\n\n");
		
		// test case 7: goofy, godfather
		
		wordA = "goofy";
		wordB = "godfather";
		
		words.setWords(wordA, wordB);
		words.compare();
		System.out.println(words + "\n\n");
		
		// test case 8: funnel, fun
		
		wordA = "funnel";
		wordB = "fun";
		
		words.setWords(wordA, wordB);
		words.compare();
		System.out.println(words + "\n\n");

	}
}