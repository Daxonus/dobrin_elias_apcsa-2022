//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - 1/24/2022
//Class - AP Computer Science A+ - Mr. Mauro Period 1
//Lab  - String Odd Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		return (word.length() % 2 == 0);
	}

 	public String toString()
 	{
 		String output=word + " is ";
 		
 		if(isEven())
 		{
 			output += "even";
 		}
 		
 		else
 		{
 			output += "odd";
 		}
 		
 		output += "\n";
 		
 		return output;
	}
}