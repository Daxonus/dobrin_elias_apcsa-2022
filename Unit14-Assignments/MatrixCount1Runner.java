//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		System.out.println("Matrix Values");
		
		for(int a = 0; a < MatrixCount1.m.length; a++)
		{
			for(int b = 0; b < MatrixCount1.m[a].length; b++)
			{
				System.out.print(MatrixCount1.m[a][b] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The 7 count is :: " + MatrixCount1.count(7));
		System.out.println("The 8 count is :: " + MatrixCount1.count(8));
		System.out.println("The 6 count is :: " + MatrixCount1.count(6));
		System.out.println("The 21 count is :: " + MatrixCount1.count(21));
	}
}



