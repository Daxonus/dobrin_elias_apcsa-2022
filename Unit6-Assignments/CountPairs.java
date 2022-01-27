//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Elias Dobrin	

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		
		for(int s = 0; s < str.length() - 1; s++)
		{
			String s1 = str.substring(s, s + 1);
			String s2 = str.substring(s + 1, s + 2);
			
			if(s1.equals(s2))
			{
				count++;
			}
		}
		
		return count;
	}
}