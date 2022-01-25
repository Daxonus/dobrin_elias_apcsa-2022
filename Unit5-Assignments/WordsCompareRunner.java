//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - 1/24/2022
//Class - AP Computer Science A+ - Mr. Mauro Period 1
//Lab  - Words Compare

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   	WordsCompare comparer = new WordsCompare();
	   	
	   	comparer.setWords("abe", "ape");
	   	System.out.print(comparer);
	   	
	   	comparer.setWords("giraffe", "gorilla");
	   	System.out.print(comparer);
	   	
	   	comparer.setWords("one", "two");
	   	System.out.print(comparer);
	   	
	   	comparer.setWords("fun", "funny");
	   	System.out.print(comparer);
	   	
	   	comparer.setWords("123", "19");
	   	System.out.print(comparer);
	   	
	   	comparer.setWords("193", "1910");
	   	System.out.print(comparer);
	   	
	   	comparer.setWords("goofy", "godfather");
	   	System.out.print(comparer);
	   	
	   	comparer.setWords("funnel", "fun");
	   	System.out.print(comparer);
	}
}