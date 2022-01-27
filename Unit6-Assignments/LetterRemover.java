//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", 'A');
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence;
		
		while(true)
		{
			int loc = cleaned.indexOf(lookFor);
			
			if(loc == -1)
			{
				break;
			}
			
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1, cleaned.length());
		}		
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}