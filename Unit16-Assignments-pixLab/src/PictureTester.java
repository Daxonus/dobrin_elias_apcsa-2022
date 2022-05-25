/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Elias Dobrin 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.keepOnlyRed();
	    beach.explore();	  
  }

  public static void testKeepOnlyGreen()
  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.keepOnlyGreen();
	    beach.explore();	  
  }

  
  public static void testNegate()
  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();	  
  }
  
  public static void testGrayscale()
  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();	  
  }
  
  public static void testFixUnderwater()
  {
	    Picture beach = new Picture("water.jpg");
	    beach.explore();
	    beach.fixUnderwater();
	    beach.explore();		  
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	    Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();	  
  }

  public static void testMirrorHorizontal()
  {
    Picture motorcycle = new Picture("redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture motorcycle = new Picture("redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore();	  
  }
  
  public static void testMirrorArms()
  {
	    Picture snowman = new Picture("snowman.jpg");
	    snowman.explore();
	    snowman.mirrorArms();
	    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	    Picture gull = new Picture("seagull.jpg");
	    gull.explore();
	    gull.mirrorGull();
	    gull.explore();	  
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	    Picture canvas = new Picture("640x480.jpg");
	    canvas.copy(new Picture("640x480.jpg"), 40, 40);
	    canvas.explore();	  
  }
  
  public static void testMyCollage()
  {
	    Picture canvas = new Picture("640x480.jpg");
	    canvas.myCollage(canvas, canvas, canvas);
	    canvas.explore();	  
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testBackgroundSwap()
  {
	  Picture mark = new Picture("blue-mark.jpg");
	  Picture moon = new Picture("moon-surface.jpg");
	  mark.backgroundSwap(moon);
	  mark.explore();
  }
  
  public static void testEncode()
  {
	  Picture backgroundPicture = new Picture("beach.jpg");
	  Picture messagePicture = new Picture("msg.jpg");
	  backgroundPicture.encode(messagePicture);
	  backgroundPicture.explore();
  }
  
  public static void testDecode()
  {
	  Picture backgroundPicture = new Picture("beach.jpg");
	  Picture messagePicture = new Picture("msg.jpg");
	  backgroundPicture.encode(messagePicture);
	  backgroundPicture.decode().explore();
  }
  
  public static void testEncodeSave()
  {
	  Picture backgroundPicture1 = new Picture("beach.jpg");
	  Picture messagePicture1 = new Picture("msg.jpg");
	  backgroundPicture1.encode(messagePicture1);
	  backgroundPicture1.write("stegano_msg.png");
	  
	  Picture backgroundPicture2 = new Picture("beach.jpg");
	  Picture messagePicture2 = new Picture("apple_icon.jpg");
	  backgroundPicture2.encode(messagePicture2);
	  backgroundPicture2.write("stegano_apple_icon.png");
  }
  
  public static void testDecodeSaved()
  {
	  Picture decodedPicture1 = new Picture("stegano_msg.png").decode();
	  decodedPicture1.explore();
	  
	  Picture decodedPicture2 = new Picture("stegano_apple_icon.png").decode();
	  decodedPicture2.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  
	// testEncode();
	// testDecode();
	testEncodeSave();
	testDecodeSaved();
	  
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
	// testNegate();
	// testGrayscale();
	// testFixUnderwater();
	// testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
	// testMirrorHorizontalBotToTop();
	// testMirrorDiagonal();
	// testMirrorTemple();
	// testMirrorArms();
	// testMirrorGull();
    // testCollage();
    // testCopy();
	// testMyCollage();
	// testEdgeDetection();
	// testEdgeDetection2();
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
	// testBackgroundSwap();
  }
}