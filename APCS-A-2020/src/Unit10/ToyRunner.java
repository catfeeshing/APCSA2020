package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy toyA = new Toy("Alex"); // sorry i renamed them and had some fun
		Toy toyB = new Toy("Steve");
		toyB.setCount(10);
		System.out.println(toyA);
	}
}