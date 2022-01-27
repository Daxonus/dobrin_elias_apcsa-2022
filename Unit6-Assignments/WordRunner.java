//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Elias Dobrin

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word word = new Word();
		
		word.setString("Hello");
		System.out.print(word);
		
		word.setString("World");
		System.out.print(word);
		
		word.setString("JukeBox");
		System.out.print(word);
		
		word.setString("TCEA");
		System.out.print(word);
		
		word.setString("UIL");
		System.out.print(word);
	}
}