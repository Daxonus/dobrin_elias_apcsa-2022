//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - 1/24/2022
//Class - AP Computer Science A+ - Mr. Mauro Period 1
//Lab  - String Odd Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		System.out.print(new StringOddOrEven("cat"));
		System.out.print(new StringOddOrEven("boot"));
		System.out.print(new StringOddOrEven("it"));
		System.out.print(new StringOddOrEven("a"));
		System.out.print(new StringOddOrEven("eleven"));
		System.out.print(new StringOddOrEven("thirteen"));
		System.out.print(new StringOddOrEven("odd"));
		System.out.print(new StringOddOrEven("even"));
	}
}