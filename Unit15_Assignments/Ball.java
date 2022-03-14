//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
	
	public void setSpeed(int xs, int ys)
	{
		setxSpeed(xs);
		setySpeed(ys);
	}
	
	public void setxSpeed(int xs)
	{
		xSpeed = xs;
	}
	
	public void setySpeed(int ys)
	{
		ySpeed = ys;
	}
	

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location


      setX(getX()+xSpeed);
		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   

   //add the get methods
	
	public int getxSpeed()
	{
		return xSpeed;
	}
	
	public int getySpeed()
	{
		return ySpeed;
	}
	
   //add a toString() method
}