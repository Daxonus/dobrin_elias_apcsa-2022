//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] array1 = {{1,2,3},{5,5,5,5}};
		int[][] array2 = {{1,2,3},{5},{1},{2,2}};
		int[][] array3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(array1));
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(array2));
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(array3));
	}
}



