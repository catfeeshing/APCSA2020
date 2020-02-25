package Unit4;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();

		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amt));

		// Sample Data : 2500
		amt = 2500;

		System.out.println("\n\nOriginal bill amount :: " + amt);
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amt));

		// Sample Data : 4000
		amt = 4000;

		System.out.println("\n\nOriginal bill amount :: " + amt);
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amt));

		// Sample Data : 333.33
		amt = 333.33;

		System.out.println("\n\nOriginal bill amount :: " + amt);
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amt));

		// Sample Data : 95874.2154
		amt = 95874.2154;

		System.out.println("\n\nOriginal bill amount :: " + amt);
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amt));

	}
}