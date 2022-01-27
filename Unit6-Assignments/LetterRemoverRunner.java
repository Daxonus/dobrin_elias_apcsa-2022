//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover remover = new LetterRemover();
		
		remover.setRemover("I am Sam I am", 'a');
		System.out.print(remover + "\n\n");
		
		remover.setRemover("ssssssssxssssesssssesss", 's');
		System.out.print(remover + "\n\n");
		
		remover.setRemover("qwertyqwertyqwerty", 'a');
		System.out.print(remover + "\n\n");
		
		remover.setRemover("abababababa", 'b');
		System.out.print(remover + "\n\n");
		
		remover.setRemover("abaababababa", 'x');
		System.out.print(remover + "\n\n");
	}
}