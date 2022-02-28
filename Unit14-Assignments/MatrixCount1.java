//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    public static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
    	int count = 0;
    	
    	for(int a = 0; a < m.length; a++)
    	{
    		for(int b = 0; b < m[a].length; b++)
    		{
    			if(m[a][b] == val)
    			{
    				count++;
    			}
    		}
    	}
    	
    	return count;
    }
}
