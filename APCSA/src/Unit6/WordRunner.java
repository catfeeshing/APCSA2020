package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name Carolyn Cui
//Date 2/13/20

import static java.lang.System.*;

public class WordRunner {
	public static void main(String[] args) {
		// add test cases
		Word word = new Word();
		
		word.setString("Hello");
		System.out.println(word.getFirstChar());
		System.out.println(word.getLastChar());
		System.out.println(word.getBackWards());
		
		System.out.println(word + "\n\n");
		
		word.setString("World");
		System.out.println(word.getFirstChar());
		System.out.println(word.getLastChar());
		System.out.println(word.getBackWards());
		
		System.out.println(word + "\n\n");
		
		word.setString("JukeBox");
		System.out.println(word.getFirstChar());
		System.out.println(word.getLastChar());
		System.out.println(word.getBackWards());
		
		System.out.println(word + "\n\n");
		
		word.setString("TCEA");
		System.out.println(word.getFirstChar());
		System.out.println(word.getLastChar());
		System.out.println(word.getBackWards());
		
		System.out.println(word + "\n\n");
		
		word.setString("UIL");
		System.out.println(word.getFirstChar());
		System.out.println(word.getLastChar());
		System.out.println(word.getBackWards());
		
		System.out.println(word + "\n\n");
	}
}