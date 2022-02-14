//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		String[] toystrings = toys.split(" ");
		
		for(int n = 0; n < toystrings.length; n++)
		{
			if(toystrings[n].equals("hellothere"))
			{
				continue;
			}
			
			int count = 1;
			
			for(int m = 1; m < toystrings.length; m++)
			{
				if(toystrings[n].equals(toystrings[m]))
				{
					count++;
					toystrings[m] = "hellothere";
				}
			}
			
			Toy toy = new Toy(toystrings[n]);
			toy.setCount(count);
			toyList.add(toy);
		}
		
		
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int n = 0; n < toyList.size(); n++)
  		{
  			if(toyList.get(n).getName().equals(nm))
  			{
  				return toyList.get(n);
  			}
  		}
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int frequentIndex = 0;
  		
  		for(int n = 1; n < toyList.size(); n++)
  		{
  			if(toyList.get(n).getCount() > toyList.get(frequentIndex).getCount())
  			{
  				frequentIndex = n;
  			}
  		}
  		
  		return toyList.get(frequentIndex).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		while(true)
  		{
  			boolean boring = true;
  			
  			for(int n = 0; n < toyList.size() - 1; n++)
  			{
  				Toy toy1 = toyList.get(n);
  				Toy toy2 = toyList.get(n + 1);
  				
  				if(toy1.getCount() > toy2.getCount())
  				{
  					toyList.set(n, toy2);
  					toyList.set(n + 1, toy1);
  					boring = false;
  				}
  			}
  			
  			if(boring)
  			{
  				return;
  			}
  		}
  	}  
  	  
	public String toString()
	{
		String text = "";
		
		for(int n = 0; n < toyList.size(); n++)
		{
			text += toyList.get(n).toString() + "\n";
		}
		
		return text;
	}
}