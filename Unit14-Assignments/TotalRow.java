//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int a = 0; a < m.length; a++)
    	{
    		int sum = 0;
    		
    		for(int b = 0; b < m[a].length; b++)
    		{
    			sum += m[a][b];
    		}
    		
    		list.add(sum);
    	}
    	
    	return list;
    }
}
