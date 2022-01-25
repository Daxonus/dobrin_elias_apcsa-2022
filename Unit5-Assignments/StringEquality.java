//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - 1/24/2022
//Class - AP Computer Science A+ - Mr. Mauro Period 1
//Lab  - String Equality

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	private boolean same;

	public StringEquality()
	{
		
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		checkEquality();
	}

	public void checkEquality()
	{
		same = wordOne.equals(wordTwo);
	}

	public String toString()
	{
		if(same)
		{
			return wordOne + " has the same letters as " + wordTwo + "\n\n";
		}
		
		else
		{
			return wordOne + " does not have the same letters as " + wordTwo + "\n\n";
		}
	}
}