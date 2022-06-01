//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10, 10, 10, 50);
	   setSpeed(5);
   }

   //add the other Paddle constructors
   
   public Paddle(int x, int y)
   {
	   super(x, y, 10, 50);
	   setSpeed(5);
   }
   
   public Paddle(int x, int y, int s)
   {
	   super(x, y, 10, 50);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h, int s)
   {
	   super(x, y, w, h);
	   setSpeed(s);
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	   super(x, y, w, h, c);
	   setSpeed(s);
   }



   public void moveUpAndDraw(Graphics window)
   {
	   setY(getY() + speed);
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   setY(getY() - speed);
	   draw(window);
   }
   
   //add set methods
   
   public void setSpeed(int s)
   {
	   speed = s;
   }
   
   //add get methods
   
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   
   public String toString()
   {
	   return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getSpeed();
   }
   
}