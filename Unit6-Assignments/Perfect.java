//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors

   public Perfect()
   {
	   setTo(1);
   }
   
	//add a set method
   
   public void setTo(int n)
   {
	   number = n;
   }
   
	public boolean isPerfect()
	{
		int sum = 0;
		
		for(int i = 1; i < number; i++)
		{
			if(number % i == 0)
			{
				sum += i;
			}
		}
		
		return(sum == number);
	}

	//add a toString	
	
	public String toString()
	{
		if(isPerfect())
		{
			return(number + " is perfect.");
		}
		
		else
		{
			return(number + " is not perfect.");
		}
	}
}