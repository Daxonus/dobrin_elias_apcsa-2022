//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin
//Date - January 27, 2022

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int iodd = -1;
		
		for(int n = 0; n < ray.length; n++)
		{
			if(ray[n] % 2 == 1)
			{
				iodd = n;
				break;
			}
		}
		
		if(iodd == -1)
		{
			return -1;
		}
		
		int ieven = -1;
		
		for(int n = iodd + 1; n < ray.length; n++)
		{
			if(ray[n] % 2 == 0)
			{
				ieven = n;
				break;
			}
		}
		
		if(ieven == -1)
		{
			return -1;
		}
		
		return Math.abs(iodd - ieven);
	}
}