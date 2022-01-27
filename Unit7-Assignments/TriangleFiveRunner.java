//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive run = new TriangleFive();
	   
	   run.setLetter('C');
	   run.setAmount(4);
	   System.out.print(run);

	   run.setLetter('A');
	   run.setAmount(5);
	   System.out.print(run);
	   
	   run.setLetter('B');
	   run.setAmount(7);
	   System.out.print(run);
	   
	   run.setLetter('X');
	   run.setAmount(6);
	   System.out.print(run);
	   
	   run.setLetter('Z');
	   run.setAmount(8);
	   System.out.print(run);
   }
}