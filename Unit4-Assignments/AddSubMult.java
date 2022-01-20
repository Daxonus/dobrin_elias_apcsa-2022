//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin
//Date - January 20, 2022
//Class - AP Computer Science A+ - Mr. Mauro
//Lab  - AddSub

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a > b)
		{
			return a - b;
		}
		
		else if(b > a)
		{
			return b - a;
		}
		
		else
		{
			return a * b;
		}
	}
}