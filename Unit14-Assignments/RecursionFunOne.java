//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		return countEvenDigits(num, 0);
	}
	
	private static int countEvenDigits(int num, int count)
	{
		if(num > 0)
		{
			if(num % 2 == 0)
			{
				return countEvenDigits(num / 10, count + 1);
			}
			
			else
			{
				return countEvenDigits(num / 10, count);
			}	
		}
		
		else
		{
			return count;
		}
	}
}