//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy toy1 = new Toy("sorry");
		toy1.setCount(1);
		System.out.println(toy1);
		
		Toy toy2 = new Toy("gi joe");
		toy2.setCount(5);
		System.out.println(toy2);
	}
}