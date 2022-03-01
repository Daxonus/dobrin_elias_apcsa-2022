//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		boolean bored = false;
		
		while(!bored)
		{
			bored = true;
			
			for(int n = 0; n < wordRay.length - 1; n++)
			{
				if(wordRay[n].compareTo(wordRay[n + 1]) > 0)
				{
					String temp = wordRay[n];
					wordRay[n] = wordRay[n + 1];
					wordRay[n + 1] = temp;
					bored = false;
				}
			}
		}
	}

	public String toString()
	{
		String output = "";
		
		for(int n = 0; n < wordRay.length; n++)
		{
			output += wordRay[n] + "\n";
		}
		
		output += "\n\n\n";
		return output;
	}
}