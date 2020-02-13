package Unit0;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Carolyn Cui
//Date - 1/31/20
//Class - P2 AP CS A
//Lab  - Unit0 Variables

public class Variables {
	public static void main(String[] args) {
		// define 1 variable of each of the
		// following data types
		// byte < short < int < long
		// float double
		// char boolean String

		// integer variables
		byte byteOne = 127;
		short shortOne = 2;
		int intOne = 1;
		long longOne = 11111111;

		// decimal variables
		float floatOne = 12345678;
		double doubleOne = Math.PI;

		// other integer types
		char charOne = 'A';

		// other types
		boolean boolOne = true;
		String str = "One";

		// output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");

		System.out.println("*8 bit - byteOne = " + byteOne + "\t\t*");
		System.out.println("16 bit - shortOne = " + shortOne + "\t\t*");
		System.out.println("32 bit - intOne = " + intOne + "\t\t*");
		System.out.println("16 bit - longOne = " + longOne + "\t*\n");

		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        decimal types          *");
		System.out.println("*                               *");

		System.out.println("32 bit - floatOne = " + floatOne + "\t*");
		System.out.println("64 bit - doubleOne = " + doubleOne + "\t\t*\n");

		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*       other int types         *");
		System.out.println("*                               *");

		System.out.println("16 bit - charOne = " + charOne + "\t\t*\n");

		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*         other types           *");
		System.out.println("*                               *");

		System.out.println("booleanOne = " + boolOne + "\t\t*");
		System.out.println("stringOne = " + str + "\t\t\t*");

	}
}