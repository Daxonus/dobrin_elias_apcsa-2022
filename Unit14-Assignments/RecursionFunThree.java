//© A+ Computer Science  -  www.apluscompsci.com
//Name - Elias Dobrin
//Date - 2/28/2022
//Class - AP Compsci A - Mr. Mauro
//Lab  - Recursion Lucky Threes

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	
	
	public static int luckyThrees(long number)
	{
		String str = "" + number;
		int first = Integer.parseInt(str.substring(0, 1));
		
		if(first == 3)
		{
			return luckyThrees(number, 0);
		}
		
		else
		{
			return luckyThrees(number, 0);
		}
	}
	
	private static int luckyThrees(long number, int count)
	{

		String str = ("" + number);
		str = str.substring(1, str.length());
		
		if(str.length() > 0)
		{
			if(Integer.parseInt(str.substring(0, 1)) == 3)
			{
				return luckyThrees(Integer.parseInt(str.substring(0, str.length())), count + 1);
			}
			
			else
			{
				return luckyThrees(Integer.parseInt(str.substring(0, str.length())), count);
			}				
		}
		
		return count;

	}
}