package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore toy = new ToyStore();
		toy.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		toy.sortToysByCount(); // sort toys
		System.out.println(toy);
	}
}