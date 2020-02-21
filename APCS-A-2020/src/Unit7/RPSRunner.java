package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboardTwo = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();
			player = keyboard.nextLine();
			game.setPlayers(player.toUpperCase());
			//game.determineWinner();
			System.out.println(game);
			
			System.out.println("Would you like to play again? y/n :: ");
			
			response = keyboard.next().charAt(0);
			
			if (response == 'y') {
				System.out.println("type in your prompt [R,P,S] :: ");
			
				player = keyboardTwo.nextLine();
				game.setPlayers(player.toUpperCase());
				System.out.println(game);
			}
	}
}



