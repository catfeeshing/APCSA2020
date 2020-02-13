package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Carolyn Cui
//Date 2/13/20

import static java.lang.System.*;

public class Perfect {
	private int number;

	// add constructors
	
	public Perfect() {
		number = 0;
	}
	
	public Perfect(int num) {
		setNumber(num);
		number = 0;
	}

	// add a set method
	
	public void setNumber(int num) {
		number = num;
	}

	public boolean isPerfect() {
		
		int total = 0;
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				total += i;
			}
			if (total == number) {
				return true;
			}
		}
		return false;
	}

	// add a toString
	public String toString() {
		if (isPerfect() == true) {
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}

}