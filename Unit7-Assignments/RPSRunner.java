//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers("rock");
			System.out.print(game + "\n");
			
			game.setPlayers("scissors");
			System.out.print(game + "\n");
			
			game.setPlayers("paper");
			System.out.print(game + "\n");
			
			game.setPlayers("paper");
			System.out.print(game + "\n");
			
			game.setPlayers("rock");
			System.out.print(game + "\n");
	}
}



