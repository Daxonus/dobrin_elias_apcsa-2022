//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		
		for(int a = 0; a < amount; a++)
		{
			char myChar = letter;
			
			for(int b = amount; b > a; b--)
			{
				for(int c = 0; c < b; c++)
				{
					output += myChar;
				}
				
				if (myChar == 'Z')
					myChar = 'A';
				else
					myChar++;
				output += " ";
			}
			
			output += "\n";
		}
		
		return output + "\n";
	}
}