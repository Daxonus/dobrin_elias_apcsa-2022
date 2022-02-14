//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for(int n = 0; n < word.length(); n++)
		{
			String text = "";
			
			for(int m = 0; m < n + 1; m++)
			{
				text += word.substring(0, n + 1);
			}
			
			System.out.println(text);
		}
	}
}