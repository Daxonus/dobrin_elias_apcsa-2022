//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Elias Dobrin
//Date - January 20, 2022
//Class - AP Computer Science A+ - Mr. Mauro
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0, 0, 0, 0);
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		int dx = xTwo - xOne;
		int dy = yTwo - yOne;
		distance = Math.sqrt(dx*dx + dy*dy);
	}
	
	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		System.out.println("Distance: " + toString());
	}
	
	//complete print or the toString

	public String toString()
	{
		return String.format("%.3f", getDistance());
	}
}