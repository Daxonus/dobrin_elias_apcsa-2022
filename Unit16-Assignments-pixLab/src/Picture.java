import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Elias Dobrin
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setGreen(0);
	      }
	    }
  }

  public void keepOnlyRed()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(0);
	        pixelObj.setBlue(0);
	      }
	    }
  }
  
  public void keepOnlyGreen()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setBlue(0);
	      }
	    }
  }
  
  public void negate()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(255 - pixelObj.getRed());
	        pixelObj.setGreen(255 - pixelObj.getGreen());
	        pixelObj.setBlue(255 - pixelObj.getBlue());
	      }
	    }	  
  }
  
  public void grayscale()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
	        pixelObj.setRed(average);
	        pixelObj.setGreen(average);
	        pixelObj.setBlue(average);
	      }
	    }	  
  }
  
  public void fixUnderwater()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(Math.max(pixelObj.getGreen() - 30, 0));
	      }
	    }	  	  
  }

  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.print(count);
  }
  
  public void mirrorVerticalRightToLeft()
  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = width / 2; col < width; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
  }

  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[height - 1 - row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }

  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels.length;
    for (int row = height / 2; row < height; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[height - 1 - row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels.length;
    int width = pixels[0].length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = width / 2; col < width; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[height - 1 - row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorArms()
  {
	  mirrorHorizontalBotToTop();
  }
  
  public void mirrorGull()
  {
	  mirrorVertical();
  }
  
  public void backgroundSwap(Picture newBackground)
  {
	  System.out.println("Name: Elias Dobrin");
	  System.out.println("Period: 1");
	  System.out.println("Computer Number: #37");
	  System.out.println("Date: 5/17/2022");
	  
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel[][] otherPixels = newBackground.getPixels2D();
	  int height = pixels.length;
	  int width = pixels[0].length;
	  
	  // first pass
	  for(int row = 0; row < height; row++)
	  {
		  for(int col = 0; col < width; col++)
		  {
			  if(row > 362 && row < 385 && col > 354 && col < 406)
			  {
				  Pixel pixel = pixels[row][col];
				  Pixel samplePixel = pixels[row - 23][col];
				  pixel.setColor(samplePixel.getColor());
			  }
		  }
	  }
	  
	  // second pass
	  for(int row = 0; row < height; row++)
	  {
		  for(int col = 0; col < width; col++)
		  {
			  Pixel pixel = pixels[row][col];
			  
			  if(Math.abs(pixel.getRed() - 5) < 50 &&
				Math.abs(pixel.getGreen() - 42) < 50 &&
				Math.abs(pixel.getBlue() - 69) < 50)
			  {
				  Pixel otherPixel = otherPixels[row][col];
				  pixel.setColor(otherPixel.getColor());
			  }
		  }
	  }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  public void copy(Picture fromPic, 
                 int startRow, int startCol, int endRow, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < endRow &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < endCol &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void myCollage(Picture pic1, Picture pic2, Picture pic3)
  {
	  pic1.keepOnlyBlue();
	  pic2.keepOnlyGreen();
	  pic3.keepOnlyRed();
	  copy(pic1, 80, 80);
	  copy(pic2, 200, 250);
	  copy(pic3, 340, 500);
  }

  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    Pixel botPixel = null;
    Pixel topPixel = null;
    Color topColor = null;
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length; col++)
      {
        botPixel = pixels[row][col];
        topPixel = pixels[row+1][col];
        topColor = topPixel.getColor();
        if (botPixel.colorDistance(topColor) > 
            edgeDist)
          botPixel.setColor(Color.BLACK);
        else
          botPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  
  
  
  
  
  
  public void encode(Picture messagePicture)
  {
	  
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  Pixel[][] backgroundPixels = this.getPixels2D();
	  
	  for(int r = 0; r < this.getHeight(); r++)
	  {
		  for(int i = 0; i < 5 * (1 + Math.sin(20 * 2 * Math.PI * r / this.getHeight())); i++)
		  {
			  for(int c = 0; c < this.getWidth(); c++)
			  {
				  int rt = r;
				  int ct = c + 1;
				  
				  if(ct < 0)
				  {
					  ct += this.getWidth();
				  }
				  
				  if(ct >= this.getWidth())
				  {
					  ct -= this.getWidth();
				  }
				  
				  int[] temp = {messagePixels[r][c].getRed(), messagePixels[r][c].getGreen(), messagePixels[r][c].getBlue()};
				  messagePixels[r][c].setRed(messagePixels[rt][ct].getRed());
				  messagePixels[r][c].setGreen(messagePixels[rt][ct].getGreen());
				  messagePixels[r][c].setBlue(messagePixels[rt][ct].getBlue());

				  messagePixels[rt][ct].setRed(temp[0]);
				  messagePixels[rt][ct].setGreen(temp[1]);
				  messagePixels[rt][ct].setBlue(temp[2]);
			  }
		  }
	  }
	  
	  
	  Random generator = new Random(234089);
	  for(int n = 0; n < 100000; n++)
	  {
		  int r1 = generator.nextInt(0, this.getHeight());
		  int c1 = generator.nextInt(0, this.getWidth());
		  int r2 = Math.min(Math.max(r1 + generator.nextInt(-2, 2 + 1), 0), this.getHeight() - 1);
		  int c2 = Math.min(Math.max(c1 + generator.nextInt(-2, 2 + 1), 0), this.getWidth() - 1);
		  
		  //int r2 = generator.nextInt(0, this.getHeight());
		  // int c2 = generator.nextInt(0, this.getWidth());
		  
		  int[] temp = {messagePixels[r1][c1].getRed(), messagePixels[r1][c1].getGreen(), messagePixels[r1][c1].getBlue()};
		  messagePixels[r1][c1].setRed(messagePixels[r2][c2].getRed());
		  messagePixels[r1][c1].setGreen(messagePixels[r2][c2].getGreen());
		  messagePixels[r1][c1].setBlue(messagePixels[r2][c2].getBlue());
		  
		  messagePixels[r2][c2].setRed(temp[0]);
		  messagePixels[r2][c2].setGreen(temp[1]);
		  messagePixels[r2][c2].setBlue(temp[2]);
	  }
	  
	  for(int r = 0; r < this.getHeight(); r++)
	  {
		  for(int c = 0; c < this.getWidth(); c++)
		  {
			  boolean black = (messagePixels[r][c].getAverage() < 128);
			  double average = backgroundPixels[r][c].getAverage();
			  
			  if(black)
			  {
				  int delta;
				  
				  if(backgroundPixels[r][c].getRed() >= 128)
				  {
					  delta = -1;
				  }
				  
				  else
				  {
					  delta = 1;
				  }
				  
				  if(Math.round(average) == average)
				  {
					  backgroundPixels[r][c].setRed(backgroundPixels[r][c].getRed() + delta);
				  }
				  
				  average = backgroundPixels[r][c].getAverage();
				  
				  if(Math.round(average) == average)
				  {
					  backgroundPixels[r][c].setRed(backgroundPixels[r][c].getRed() + delta);
				  }
			  }
			  
			  else
			  {
				  int delta;
				  
				  if(backgroundPixels[r][c].getGreen() >= 128)
				  {
					  delta = -1;
				  }
				  
				  else
				  {
					  delta = 1;
				  }
				  
				  if(Math.round(average) != average)
				  {
					  backgroundPixels[r][c].setGreen(backgroundPixels[r][c].getGreen() + delta);
				  }
				  
				  average = backgroundPixels[r][c].getAverage();
				  
				  if(Math.round(average) != average)
				  {
					  backgroundPixels[r][c].setGreen(backgroundPixels[r][c].getGreen() + delta);
				  }
			  }
		  }
	  }
  }
  
  public Picture decode()
  {
	  Picture messagePicture = new Picture(this.getHeight(), this.getWidth());
	  Pixel[][] backgroundPixels = this.getPixels2D();
	  
	  Picture messageRandomPicture = new Picture(this.getHeight(), this.getWidth());
	  Pixel[][] messageRandomPixels = messageRandomPicture.getPixels2D();
	  
	  for(int r = 0; r < this.getHeight(); r++)
	  {
		  for(int c = 0; c < this.getWidth(); c++)
		  {
			  double average = backgroundPixels[r][c].getAverage();
			  
			  if(Math.round(average) == average)
			  {
				  messageRandomPixels[r][c].setRed(255);
				  messageRandomPixels[r][c].setGreen(255);
				  messageRandomPixels[r][c].setBlue(255);
			  }
			  
			  else
			  {
				  messageRandomPixels[r][c].setRed(0);
				  messageRandomPixels[r][c].setGreen(0);
				  messageRandomPixels[r][c].setBlue(0);
			  }
		  }
	  }
	  
	  return messageRandomPicture;
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
