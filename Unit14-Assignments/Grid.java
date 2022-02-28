//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[cols][rows];
		
		for(int a = 0; a < cols; a++)
		{
			for(int b = 0; b < rows; b++)
			{
				grid[a][b] = vals[(int) Math.floor(Math.random() * vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] counts = new int[vals.length];
		
		for(int v = 0; v < vals.length; v++)
		{
			int count = countVals(vals[v]);
			counts[v] = count;
			System.out.println(vals[v] + " count is " + count);
		}
		
		int index = 0;
		
		for(int i = 1; i < counts.length; i++)
		{
			if(counts[i] > counts[index])
			{
				index = i;
			}
		}
		
		System.out.println();
		System.out.println(vals[index] + " occurs the most.");
		return vals[index];
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		
		for(int a = 0; a < grid.length; a++)
		{
			for(int b = 0; b < grid[0].length; b++)
			{
				if(val.equals(grid[a][b]))
				{
					count++;
				}
			}
		}
		
		return count;
	}

	//display the grid
	public String toString()
	{
		String output = "";
		
		for(int a = 0; a < grid.length; a++)
		{
			for(int b = 0; b < grid[0].length; b++)
			{
				output += grid[a][b] + " ";
			}
			
			output += "\n";
		}
		
		return output;
	}
}