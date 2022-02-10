//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin
//Date - February 10, 2022

import java.util.List;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		for(int n = 0; n < numArray.size() - 1; n++)
		{
			if(numArray.get(n) <= numArray.get(n + 1))
			{
				return false;
			}
		}
		
		return true;
	}	
}