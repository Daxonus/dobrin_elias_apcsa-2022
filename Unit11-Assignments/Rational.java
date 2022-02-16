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
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{
		ArrayList<Integer> factorsOne = new ArrayList<Integer>();
		
		for(int n = 1; n <= numOne; n++)
		{
			if(numOne % n == 0)
			{
				factorsOne.add(n);
			}
		}
		
		ArrayList<Integer> factorsTwo = new ArrayList<Integer>();
		
		for(int n = 1; n < numTwo; n++)
		{
			if(numTwo % n == 0)
			{
				factorsTwo.add(n);
			}
		}


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}