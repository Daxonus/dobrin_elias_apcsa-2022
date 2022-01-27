//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elias Dobrin

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect perfector = new Perfect();
		
		perfector.setTo(496);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(45);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(6);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(14);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(8128);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(1245);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(33);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(28);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(27);
		System.out.print(perfector + "\n\n");
		
		perfector.setTo(33550336);
		System.out.print(perfector + "\n\n");
	}
}