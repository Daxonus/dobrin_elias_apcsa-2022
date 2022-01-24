//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin
//Date - 1/24/2022


public class FirstLastVowel
{	
   public static String go(String a)
	{
	   String vowels = "aeiouAEIOU";
	   String astart = a.substring(0, 1);
	   String aend = a.substring(a.length() - 1, a.length());
	   
	   for(int n = 0; n < vowels.length(); n++)
	   {
		   String vowel = vowels.substring(n, n + 1);
		   
		   if(astart.equals(vowel) || aend.equals(vowel))
		   {
			   return "yes";
		   }
	   }
	   
	   return "no";
	}
}