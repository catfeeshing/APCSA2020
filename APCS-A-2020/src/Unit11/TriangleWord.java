package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		
		int len = word.length();
		String w = "";
		for(int i = 1; i<= len; i++) {
			for(int j = 1; j <= i; j++) {
				w = word.substring(0,i);
				System.out.print(w);
			}
			System.out.println("");
		}
		
		/*
		int num = 0;
		//char[] letters = word.toCharArray();
		for (int i = 0; i <= word.length()-1; i++) {
			for (int a = i; a<=word.length()-1; a++) {
				for (int j = 0; j <= word.length()-1; j++) {
				System.out.print(word.substring(0,num));
				}
			if (num < word.length()) {
				num++;
			}
			System.out.println("");
			*/
			
			
			
			/*
			num++;
			for (int j = num; j <= word.length()-1; j++) {
				for (int k = i; k <= word.length()-1; k++) {
					System.out.print(letters[k]);
				}
			}
			*/
			}
		
	}
