//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		if(spot >= 0 && spot < pups.length)
		{
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		int oldestIndex = 0;
		
		for(int n = 1; n < pups.length; n++)
		{
			if(pups[n].getAge() > pups[oldestIndex].getAge())
			{
				oldestIndex = n;
			}
		}
		
		return pups[oldestIndex].getName();
	}

	public String getNameOfYoungest()
	{
		int youngestIndex = 0;
		
		for(int n = 1; n < pups.length; n++)
		{
			if(pups[n].getAge() < pups[youngestIndex].getAge())
			{
				youngestIndex = n;
			}
		}
		
		return pups[youngestIndex].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}