//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Elias Dobrin

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		
		int choice = (int)(3 * Math.random());
		
		switch(choice)
		{
			case 0:
				compChoice = "rock";
				break;
			case 1:
				compChoice = "paper";
				break;
			case 2:
				compChoice = "scissors";
				break;
		}
	}

	public String determineWinner()
	{
		String winner;
		
		if((playChoice == "rock" && compChoice == "scissors") || (playChoice == "paper" && compChoice == "rock") || (playChoice == "scissors" && compChoice == "paper"))
		{
			winner = "player";
		}
		
		else if(playChoice == compChoice)
		{
			winner = "no one";
		}
		
		else
		{
			winner = "computer";
		}
		
		return winner;
	}

	public String toString()
	{
		String output = determineWinner() + " has won the game with player being " + playChoice + " and computer being " + compChoice + ".";
		return output;
	}
}