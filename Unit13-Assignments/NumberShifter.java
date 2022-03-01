//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		
		for(int n = 0; n < size; n++)
		{
			array[n] = (int) Math.floor(10 * Math.random());
		}
		
		return array;
	}
	public static void shiftEm(int[] array)
	{
		boolean bored = false;
		
		while(!bored)
		{
			bored = true;
			
			for(int n = 0; n < array.length - 1; n++)
			{
				if(array[n] == 7)
				{
					continue;
				}
				
				else if(array[n + 1] == 7)
				{
					bored = false;
					array[n + 1] = array[n];
					array[n] = 7;
				}
			}
		}
	}
}