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

	public AlienHorde(int size, int thick)
	{
		aliens = new ArrayList<Alien>(size);
		
		for(int t = 0; t < thick; t++)
		{
			for(int a = 0; a < size; a++)
			{
				aliens.add(new Alien(100 * a, 50 * t));
			}			
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
		for(int a = 0; a < aliens.size(); a++)
		{
			for(int s = 0; s < shots.size(); s++)
			{
				Alien alien = aliens.get(a);
				Ammo shot = shots.get(s);
				
				if(alien.getX() > shot.getX() && alien.getX() - alien.getWidth() < shot.getX())
				{
					if(alien.getY() > shot.getY() && alien.getY() - alien.getHeight() < shot.getY())
					{
						System.out.print("Hit");
						aliens.remove(a);
						shots.remove(s);
						removeDeadOnes(shots);
						return;
					}
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
