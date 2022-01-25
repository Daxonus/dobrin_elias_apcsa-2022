//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - 1/24/2022
//Class - AP Computer Science A+ - Mr. Mauro Period 1
//Lab  - Words Compare

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
	private int compare;

	public WordsCompare()
	{
		
	}

	public WordsCompare(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		compare();
	}

	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n\n";
		}
	}
}