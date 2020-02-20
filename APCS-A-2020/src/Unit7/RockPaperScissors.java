package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = " ";
		compChoice = " ";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compChoice = "R";
	}

	public String determineWinner()
	{
		
		// 0 = rock
		// 1 = paper
		// 2 = scissors
		
		// identify computer choice, int
		
		int comp = (int) (Math.random() * 3);
		//System.out.println(compChoice);
		
		// convert int to correlating rps
		
		if (comp == 0) {
			compChoice = "R";
		}
		else if (comp == 1) {
			compChoice = "P";
		}
		else if (comp == 2) {
			compChoice = "S";
		}
		
		//System.out.println("this is " + compChoice);
		String winner=" ";
		
		// player chooses rock
		// System.out.println(playChoice + " " + compChoice);
		
		if (playChoice.equals("R")) {
			if (compChoice.equals("R")) {
				winner = "!Draw Game!";
			}
			else if (compChoice.equals("P")) {
				winner = "!Computer wins <<Paper Covers Rock>>!";
			}
			else if (compChoice.equals("S")) {
				winner = "!Player wins <<Rock Breaks Scissors>>!";

			}
		}
		
		// player chooses paper
		
		if (playChoice.equals("P")) {
			if (compChoice == "R") {
				winner = "!Player wins <<Paper Covers Rock>>!";
			}
			else if (compChoice.equals("P")) {
				winner = "!Draw Game!";
			}
			else if (compChoice.equals("S")) {
				winner = "!Computer wins <<Scissors Cuts Paper>>";
			}
		}
		
		// player chooses scissors
		
		if (playChoice.equals("S")) {
			if (compChoice.equals("R")) {
				winner = "!Computer wins <<Rock Breaks Scissors>>!";
			}
			else if (compChoice.equals("P")) {
				winner = "!Player wins <<Scissors Cut Paper>>!";
			}
			else if (compChoice.equals("S")) {
				winner = "!Draw Game!";
			}
		}
		
		return "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + winner;
	}

	public String toString()
	{
		String output = determineWinner();
		return output;
	}
}