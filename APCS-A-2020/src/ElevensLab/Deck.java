package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
	public Deck() {
		//refer to new ArrayList
		cards = new ArrayList<Card>();
		//set to top of deck (51)
		top = 51;
		//loop through all suits
		for (int i = 0; i < SUITS.length; i++) {
			//loop through all faces 1 to 13
			for (int j = 1; j <= 13; j++) {
				cards.add(new Card(SUITS[i], j)); // creates new card per each loop
				System.out.println(cards);
			}
		}
	}
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
	public Card dealCard() {
		return cards.get(top);
	}
   
   //write a shuffle() method
	public Card shuffle() {
		Collections.shuffle()
	}
   	//use Colletions.shuffle
   	//reset the top card 
}