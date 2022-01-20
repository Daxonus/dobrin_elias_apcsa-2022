//© A+ Computer Science  -  www.apluscompsci.com
//Name - Elias Dobrin
//Date - January 20, 2022
//Class - AP Computer Science A+ - Mr. Mauro
//Lab  - Line

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double dx = x2 - x1;
		double dy = y2 - y1;
		return dy / dx;
	}

}