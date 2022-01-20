//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - January 20, 2022
//Class - AP Computer Science A+ - Mr. Mauro
//Lab  - OddEvenNum

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		return !isEven(num);
	}
	public static boolean isEven( int num )
	{
		return (num % 2 == 0);
	}	
}