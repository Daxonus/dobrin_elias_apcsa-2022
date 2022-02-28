//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		int count = 0;
		String str = "" + num;
		
		for(int n = 0; n < str.length(); n++)
		{
			if(Integer.parseInt(str.substring(n, n + 1)) % 2 == 0)
			{
				count++;
			}
		}
		
		return count;
	}
}