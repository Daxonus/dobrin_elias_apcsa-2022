//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "b", "c", "7", "9", "x", "2"};
		Grid grid = new Grid(20, 20, vals);
		System.out.print(grid);
		System.out.println();
		grid.findMax(vals);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		Grid grid2 = new Grid(10, 10, vals);
		System.out.print(grid2);
		System.out.println();
		grid2.findMax(vals);
	}
}