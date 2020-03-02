package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
	
	private String suit;
	private int face;
	private String rank;
	private int pointValue;

  	//constructors
	
	public Card(String cardSuit, int cardFace) {
		setCards(cardSuit, cardFace);
	}
	
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}

	public Card() {
		// TODO Auto-generated constructor stub
	}

		// modifiers
		//set methods
		public void setCards(String cardSuit, int cardFace) {
			suit = cardSuit;
			face = cardFace;
		}
		
		public void setSuit(String cardSuit) {
			suit = cardSuit;
		}
		
		public void setFace(int cardFace) {
			face = cardFace;
		}
		
		public void setRank(String cardRank) {
			rank = cardRank;
		}


  	//accessors
		//get methods
		
		public String getSuit() {
			return suit;
		}
		public int getFace() {
			
			return face;
		}
		public String getRank() {
			return rank;
		}
		public int getPointVal() {
			return pointValue;
		}


  	//toString
		public String toString() {
			if (pointValue == 0) {
				return FACES[face] + " of " + suit + "\n";
			}
			else {
				return rank + " of " + suit + " (point value = " + pointValue + " ) \n\n";
			}
			
			
			//return FACES[face] + " of " + suit + "\n" + rank + " of " + suit + " (point value = " + pointValue + " ) \n\n";
		}
		
		public boolean match(Card aCard) {
			if(this.getSuit().equals(aCard) && this.getRank().equals(aCard) && this.getPointVal() == aCard.getPointVal()) {
				return true;
			}
			else {
				return false;
			}
		}

 }