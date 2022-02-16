//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toylist;

	public ToyStore()
	{
		toylist = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		toylist.clear();
		HashSet<String> toyhash = new HashSet<String>();
		String[] toystrings = toys.split(" ");
		
		for(int n = 0; n < toystrings.length; n++)
		{
			toyhash.add(toystrings[n]);
		}
		
		Object[] toyarray = toyhash.toArray();
		
		for(int n = 0; n < toyarray.length; n++)
		{
			Toy toy = new Toy(toyarray[n].toString());
			toy.setCount(0);
			
			for(int i = 0; i < toystrings.length; i++)
			{
				if(toystrings[i].equals(toyarray[n]))
				{
					toy.setCount(toy.getCount() + 1);
				}
			}
			
			toylist.add(toy);
		}
		
		
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int n = 0; n < toylist.size(); n++)
  		{
  			if(toylist.get(n).getName().equals(nm))
  			{
  				return toylist.get(n);
  			}
  		}
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int frequentIndex = 0;
  		
  		for(int n = 1; n < toylist.size(); n++)
  		{
  			if(toylist.get(n).getCount() > toylist.get(frequentIndex).getCount())
  			{
  				frequentIndex = n;
  			}
  		}
  		
  		return toylist.get(frequentIndex).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		while(true)
  		{
  			boolean boring = true;
  			
  			for(int n = 0; n < toylist.size() - 1; n++)
  			{
  				Toy toy1 = toylist.get(n);
  				Toy toy2 = toylist.get(n + 1);
  				
  				if(toy1.getCount() > toy2.getCount())
  				{
  					toylist.set(n, toy2);
  					toylist.set(n + 1, toy1);
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
		
		for(int n = 0; n < toylist.size(); n++)
		{
			text += toylist.get(n).toString() + "\n";
		}
		
		return text;
	}
}