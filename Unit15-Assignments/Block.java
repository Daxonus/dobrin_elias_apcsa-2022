//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100, 150);
		setSize(10,10);
		setColor(Color.black);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y)
	{
		setPos(x, y);
		setSize(10, 10);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int w, int h)
	{
		setPos(x, y);
		setSize(w, h);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setPos(x, y);
		setSize(w, h);
		setColor(c);
	}
	
   //add the other set methods
	
	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public void setX(int x)
	{
		xPos = x;
	}
	
	public void setY(int y)
	{
		yPos = y;
	}
	
	public void setSize(int w, int h)
	{
		width = w;
		height = h;
	}

   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
	   draw(window, getColor());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block) obj;
		return (getX() == other.getX() && getY() == other.getY() && getWidth() == other.getWidth() && getHeight() == other.getHeight());
	}   

   //add the other get methods
	
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Color getColor()
	{
		return color;
	}

   //add a toString() method  - x , y , width, height, color
	
	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
	}
}