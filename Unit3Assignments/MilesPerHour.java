//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - January 20, 2022
//Class - AP Computer Science A+ - Mr. Mauro
//Lab  - MilesPerHour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double ddistance = distance;
		double dhours = hours;
		double dminutes = minutes;
		mph = ddistance / (dhours + dminutes / 60);
	}

	public void print()
	{
		System.out.println("A car going " + distance + " miles in " + hours + " hours and " + minutes + " minutes is going " + mph + " MPH");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}