//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	public static int getNumDigits(int number)
	{
		int log = (int) Math.log10(number);
		return log + 1;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		String temp = Integer.toString(number);
		
		for(int n = 0; n < sorted.length; n++)
		{
			sorted[n] = Integer.parseInt(temp.substring(n, n + 1));
		}
		
		sortArray(sorted);
		return sorted;
	}
	
	private static void sortArray(int[] array)
	{
		boolean bored = false;
		
		while(!bored)
		{
			bored = true;
			
			for(int n = 0; n < array.length - 1; n++)
			{
				if(array[n] > array[n + 1])
				{
					int temp = array[n];
					array[n] = array[n + 1];
					array[n + 1] = temp;
					bored = false;
				}
			}
		}
	}
}