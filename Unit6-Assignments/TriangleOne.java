//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Elias Dobrin

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		setWord("");
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print()
	{
		for(int i = word.length(); i > 0; i--)
		{
			System.out.print(word.substring(0, i) + "\n");
		}
		
		System.out.print("\n\n");
	}
}