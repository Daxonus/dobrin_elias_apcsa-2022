//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] array1 = NumberShifter.makeLucky7Array(10);
		printArray(array1);
		NumberShifter.shiftEm(array1);
		printArray(array1);
		
		System.out.println();
		System.out.println();
		
		int[] array2 = NumberShifter.makeLucky7Array(15);
		printArray(array2);
		NumberShifter.shiftEm(array2);
		printArray(array2);
		
		System.out.println();
		System.out.println();
		
		int[] array3 = NumberShifter.makeLucky7Array(20);
		printArray(array3);
		NumberShifter.shiftEm(array3);
		printArray(array3);
	}
	
	private static void printArray(int[] array)
	{
		System.out.print("[");
		
		for(int n = 0; n < array.length - 1; n++)
		{
			System.out.print(array[n] + ", ");
		}
		
		System.out.print(array[array.length - 1]);
		System.out.print("]");
		System.out.println();
	}
}



