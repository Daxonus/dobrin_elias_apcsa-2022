//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String name1 = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		
		//instantiate monster one
		Monster monster1 = new Skeleton(name1, size1);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Monster monster2 = new Skeleton(name2, size2);
		
		System.out.println();
		System.out.println("Monster 1 - " + monster1);
		System.out.println("Monster 2 - " + monster2);
		System.out.println();
		
		if(monster1.isSmaller(monster2))
		{
			System.out.println("Monster one is smaller than Monster two.");
		}
		
		else if(monster1.isBigger(monster2))
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		
		else
		{
			System.out.println("Monster one is the same size as monster two.");
		}
		
		if(monster1.namesTheSame(monster2))
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
		
		else
		{
			System.out.println("Monster one does not have the same name as Monster two.");
		}
		
	}
}