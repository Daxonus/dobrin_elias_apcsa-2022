//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(100, 100, 100, 100, 5);
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x, y, 100, 100, 5);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x, y, 100, 100, s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.print("Cant display image");
		}
	}


	public void setSpeed(int s)
	{
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		if(direction.equals("LEFT"))
		{
			setX(getX() - speed);
		}
		
		else if(direction.equals("RIGHT"))
		{
			setX(getX() + speed);
		}
		
		else if(direction.equals("UP"))
		{
			setY(getY() - speed);
		}
		
		else if(direction.equals("DOWN"))
		{
			setY(getY() + speed);
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
