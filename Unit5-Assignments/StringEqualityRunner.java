//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - 1/24/2022
//Class - AP Computer Science A+ - Mr. Mauro Period 1
//Lab  - String Equality

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality comparer = new StringEquality();
		
		comparer.setWords("hello", "goodbye");
		System.out.print(comparer);
		
		comparer.setWords("one", "two");
		System.out.print(comparer);
		
		comparer.setWords("three", "four");
		System.out.print(comparer);
		
		comparer.setWords("TCEA", "UIL");
		System.out.print(comparer);
		
		comparer.setWords("State", "Champions");
		System.out.print(comparer);
		
		comparer.setWords("ABC", "ABC");
		System.out.print(comparer);
		
		comparer.setWords("ABC", "CBA");
		System.out.print(comparer);
		
		comparer.setWords("Same", "Same");
		System.out.print(comparer);
	}
}