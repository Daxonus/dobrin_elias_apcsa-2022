//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - January 20, 2022
//Class - AP Computer Science A+ - Mr. Mauro
//Lab  - MilesPerHour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		// test cases can be done by running program and entering inputs again.
		
	}
}