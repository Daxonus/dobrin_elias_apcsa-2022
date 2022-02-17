//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] words = new Word[size];
		
		for(int n = 0; n < size; n++)
		{
			String line = file.nextLine();
			words[n] = new Word(line);
		}
		
		// sorting words
		boolean bored = false;
		while(!bored)
		{
			bored = true;
			
			for(int n = 0; n < size - 1; n++)
			{	
				int comparison = words[n].compareTo(words[n + 1]);
				
				if(comparison > 0)
				{
					bored = false;
					Word temp = words[n];
					words[n] = words[n + 1];
					words[n + 1] = temp;
				}
			}
		}
		
		// outputting words
		
		for(int n = 0; n < size; n++)
		{
			System.out.println(words[n]);
		}







	}
}