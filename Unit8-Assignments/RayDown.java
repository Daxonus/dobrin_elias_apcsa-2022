//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin
//Date - January 27, 2022

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		for(int i = 0; i < numArray.length - 1; i++)
		{
			if(numArray[i] <= numArray[i + 1])
			{
				return false;
			}
		}
		
		return true;
	}	
}