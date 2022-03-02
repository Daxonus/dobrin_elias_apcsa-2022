//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.util.*;
import java.io.*; 

public class WordSearch
{
	// m structured and accessed by (row, column) or (y, x)
    private String[][] m;

    public WordSearch( int size, String str )
    {	
    	m = new String[size][size];
    	
    	for(int r = 0; r < size; r++)
    	{
    		for(int c = 0; c < size; c++)
    		{
    			int loc = r * size + c;
    			m[r][c] = str.substring(loc, loc + 1);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for(int r = 0; r < m.length; r++)
    	{
    		for(int c = 0; c < m.length; c++)
    		{
    			if(
					checkRight(word, r, c) || 
					checkLeft(word, r, c) || 
					checkUp(word, r, c) || 
					checkDown(word, r, c) || 
					checkDiagUpRight(word, r, c) || 
					checkDiagUpLeft(word, r, c) || 
					checkDiagDownLeft(word, r, c) || 
					checkDiagDownRight(word, r, c)
					)
    			{
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
	{
		if(c + w.length() > m.length)
		{
			return false;
		}
		
		for(int n = 0; n < w.length(); n++)
		{
			if(!m[r][c + n].equals(w.substring(n, n + 1)))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if(c - w.length() + 1 < 0)
		{
			return false;
		}
		
		for(int n = 0; n < w.length(); n++)
		{
			if(!m[r][c - n].equals(w.substring(n, n + 1)))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		if(r - w.length() + 1 < 0)
		{
			return false;
		}
		
		for(int n = 0; n < w.length(); n++)
		{
			if(!m[r - n][c].equals(w.substring(n, n + 1)))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkDown(String w, int r, int c)
	{
		if(r + w.length() > m.length)
		{
			return false;
		}
		
		for(int n = 0; n < w.length(); n++)
		{
			if(!m[r + n][c].equals(w.substring(n, n + 1)))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if(r - w.length() + 1 < 0 || c + w.length() + 1 > m.length)
		{
			return false;
		}
		
		for(int n = 0; n < w.length(); n++)
		{
			if(!m[r - n][c + n].equals(w.substring(n, n + 1)))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if(r - w.length() + 1 < 0 || c - w.length() + 1 < 0)
		{
			return false;
		}
		
		for(int n = 0; n < w.length(); n++)
		{
			if(!m[r - n][c - n].equals(w.substring(n, n + 1)))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
	{
		if(r + w.length() > m.length || c - w.length() + 1 < 0)
		{
			return false;
		}
		
		for(int n = 0; n < w.length(); n++)
		{
			if(!m[r + n][c - n].equals(w.substring(n, n + 1)))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if(r + w.length() > m.length || c + w.length() > m.length)
		{
			return false;
		}
		
		for(int n = 0; n < w.length(); n++)
		{
			if(!m[r + n][c + n].equals(w.substring(n, n + 1)))
			{
				return false;
			}
		}
		
		return true;
	}

    public String toString()
    {
    	String output = "";
    	
    	for(int x = 0; x < m.length; x++)
    	{
    		for(int y = 0; y < m.length; y++)
    		{
    			output += m[x][y] + " ";
    		}
    		
    		output += "\n";
    	}

 		return output;
    }
}
