//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import static java.lang.System.*; 
import java.util.ArrayList;

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;
	
	//write two constructors
	
	public Rational()
	{
		setRational(1, 1);
	}
	
	public Rational(int num, int den)
	{
		setRational(num, den);
	}

	//write a setRational method
	
	public void setRational(int num, int den)
	{
		numerator = num;
		denominator = den;
	}

	//write  a set method for numerator and denominator
	
	public void setNumerator(int num)
	{
		numerator = num;
	}
	
	public void setDenominator(int den)
	{
		denominator = den;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		numerator = numerator * other.denominator + other.numerator * denominator;
		denominator = denominator * other.denominator;
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
	}

	private int gcd(int numOne, int numTwo) // greatest common divisor
	{
		int divisor = 1;
		int quotientOne = numOne;
		int quotientTwo = numTwo;
		
		for(int n = Math.min(numOne, numTwo); n > 1; n--)
		{
			if(quotientOne % n == 0 && quotientTwo % n == 0)
			{
				divisor *= n;
				quotientOne /= n;
				quotientTwo /= n;
			}
		}

		return divisor;
	}

	public Object clone ()
	{
		return new Rational(numerator, denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public boolean equals( Object obj)
	{
		Rational rational2 = (Rational) obj;
		return (numerator * rational2.denominator == denominator * rational2.numerator);
	}

	public int compareTo(Rational other)
	{
		int determinant1 = numerator * other.denominator - denominator * other.numerator;
		
		if(determinant1 < 0)
		{
			return -1;
		}
		
		else if(determinant1 > 0)
		{
			return 1;
		}
		
		return 0;
	}
	
	//write  toString() method
	
	public String toString()
	{
		return numerator + "/" + denominator;
	}
	
}