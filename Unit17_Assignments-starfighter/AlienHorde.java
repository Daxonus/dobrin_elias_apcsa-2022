//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private boolean goingRight;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		
		for(int a = 0; a < size; a++)
		{
			aliens.add(new Alien(100 * a, 0));
		}
		
		goingRight = true;
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien alien : aliens)
		{
			alien.draw(window);
		}
	}

	public void moveEmAll()
	{	
		if(goingRight)
		{
			for(Alien alien : aliens)
			{
				alien.move("RIGHT");
			}
		}
		
		else
		{
			for(Alien alien : aliens)
			{
				alien.move("LEFT");
			}			
		}
		
		int minX = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		
		for(Alien alien : aliens)
		{
			if(alien.getX() < minX)
			{
				minX = alien.getX();
			}
			
			if(alien.getX() > maxX)
			{
				maxX = alien.getX();
			}
		}
		
		if(minX < 0)
		{
			goingRight = true;
		}
		
		if(maxX > 800)
		{
			goingRight = false;
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
	}

	public String toString()
	{
		return "";
	}
}
