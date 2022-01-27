//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin
//Date - January 26, 2022

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		int lastval = ray[ray.length - 1];
		
		for(int i = 0; i < ray.length; i++)
		{
			int val = ray[i];
			
			if(val > lastval)
			{
				sum += val;
			}
		}
		
		if(sum == 0)
		{
			return -1;
		}
		
		return sum;
	}
}