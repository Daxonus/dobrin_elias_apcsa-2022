//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin
//Date - February 10, 2022

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		if(ray.size() == 0)
		{
			return -1;
		}
		
		int first = ray.get(0);
		int sum = 0;
		boolean summed = false;
		
		for(Integer n: ray)
		{
			if(n > first)
			{
				sum += n;
				summed = true;
			}
		}
		
		if(summed)
		{
			return sum;
		}
		
		return -1;
	}
}