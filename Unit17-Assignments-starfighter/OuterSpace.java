//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private boolean isWin;
	private boolean isOver;
	private Ship ship;
	private AlienHorde horde;
	private Bullets shots;
	private int ammoCooldown;
	
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);
		
		isWin = false;
		isOver = false;
		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400, 300);
		horde = new AlienHorde(5, 3);
		shots = new Bullets();
		ammoCooldown = 0;

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(isWin == true)
		{
			graphToBack.setColor(Color.GREEN);
			graphToBack.fillRect(0, 0, 800, 600);
			twoDGraph.drawImage(back, null, 0, 0);
			return;
		}
		
		if(isOver == true)
		{
			graphToBack.setColor(Color.RED);
			graphToBack.fillRect(0, 0, 800, 600);
			twoDGraph.drawImage(back, null, 0, 0);
			return;
		}
		
		//add code to move Ship, Alien, etc.
		
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		
		if(keys[4] == true && ammoCooldown == 0)
		{
			shots.add(new Ammo(ship.getX() + ship.getWidth() / 2, ship.getY() + ship.getHeight() / 2));
			ammoCooldown = 20;
		}
		
		if(ammoCooldown > 0)
		{
			ammoCooldown--;
		}
		
		horde.moveEmAll();
		shots.moveEmAll();
		horde.removeDeadOnes(shots.getList());
		
		for(int a = 0; a < horde.getList().size(); a++)
		{
			Alien alien = horde.getList().get(a);
			
			if(ship.getX() + ship.getWidth() > alien.getX() && ship.getX() < alien.getX() + alien.getWidth())
			{
				if(ship.getY() + ship.getHeight() > alien.getY() && ship.getY() < alien.getY() + alien.getHeight())
				{
					System.out.print("You died");
					isOver = true;
				}
			}
		}
		
		if(horde.getList().size() == 0)
		{
			isWin = true;
		}

		
		shots.cleanEmUp();
		shots.drawEmAll(graphToBack);
		horde.drawEmAll(graphToBack);
		ship.draw(graphToBack);

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

