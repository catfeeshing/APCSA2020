package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int num, den;

	//write two constructors
	public Rational () {
		setRational(0,0);
	}
	
	public Rational(int numa, int numb) {
		setRational(numa,numb);
	}

	//write a setRational method
	public void setRational(int numa, int numb) {
		num = numa;
		den = numb;
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int numa) {
		num = numa;
	}
	
	public void setDenominator(int numb) {
		den = numb;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		int numerator = num*other.getDenominator() + other.getNumerator()*den;
		//new denominator = (den1 * den2)
		int denominator = den*other.getDenominator();
		
		num = numerator;
		den = denominator;

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(num, den);
		num = num/gcd;
		den = den/gcd;

	}

	private int gcd(int numOne, int numTwo)
	{
		if (numTwo == 0) {
			return numOne;
		}
		return gcd(numTwo,numOne&numTwo);
	}

	public Object clone ()
	{
		return new Rational(num, den);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	public boolean equals( Object obj)
	{
		Rational object = (Rational)obj;
		object.reduce();
		this.reduce();
		if(num == object.num && den == object.den) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if ((double)num/den > (double)other.num/other.den) {
			return 1;
		}
		return -1;
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
	
	
}