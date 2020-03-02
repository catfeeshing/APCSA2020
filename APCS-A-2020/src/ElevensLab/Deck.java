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
	private int size;

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
		size = cards.size();
		top = size-1;
		// shuffle method
	}
	
	public Deck(String[] ranks, String[] suits, int[] pointValue) {
		cards = new ArrayList<Card>();
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				cards.add(new Card(ranks[i], suits[j], pointValue[i]));
			}
		}
		size = cards.size();
		top = size-1;
		//shuffle()
	}
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
	public Card dealCard() {
		Card topCard;
		if(!isEmpty(cards)) {
			topCard = cards.get(top);
		}
		else {
			return new Card();
		}
		
		top--;
		size--;
		
		return topCard;
	}
	
	public boolean isEmpty(List<Card> checkCards) { // is the deck empty
		return size <= 0;
	}
   
   // Collections shuffle method to shuffle the deck.
	public void shuffle() {
   	//use Colletions.shuffle
		Collections.shuffle(cards);
	}
	
	
	// Reset the deck.
	public void topReset() {
		size = cards.size();
		top = size-1;
	}
}