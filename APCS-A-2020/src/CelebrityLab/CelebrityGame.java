  
package CelebrityLab;
import java.util.ArrayList;

/**
 * The framework for the Celebrity Game project
 * 
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	/**
	 * A reference to a Celebrity or subclass instance.
	 */

	/**
	 * The GUI frame for the Celebrity game.
	 */

	/**
	 * The ArrayList of Celebrity values that make up the game
	 */

	/**
	 * Builds the game and starts the GUI
	 */
	private ArrayList<Celebrity> celebGameList;
	private CelebrityFrame gameWindow;
	
	public Celebrity gameCelebrity;
	
	public CelebrityGame()
	{
		celebGameList = new ArrayList<Celebrity>();
		gameWindow = new CelebrityFrame(this);
	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 */
	public void prepareGame()
	{
		celebGameList = new ArrayList<Celebrity>();
		gameWindow.replaceScreen("START");
	}

	/**
	 * Determines if the supplied guess is correct.
	 * 
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */
	public boolean processGuess(String guess)
	{
		// yeeted old code --> too complex
		
		String g = guess.trim();
		if(g.equalsIgnoreCase(gameCelebrity.getAnswer())) {
			celebGameList.remove(gameCelebrity);
			if(celebGameList.size() > 0) {
				gameCelebrity = celebGameList.get(0);
			} else {
				gameCelebrity = new Celebrity("", "");
			}
			return true;
		}
		return false;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{	
		if(celebGameList != null && celebGameList.size() > 0) {
			gameCelebrity = celebGameList.get(0);
			gameWindow.replaceScreen("GAME");
		}
		
	}

	/**
	 * Adds a Celebrity of specified type to the game list
	 * 
	 * @param name
	 *            The name of the celebrity
	 * @param guess
	 *            The clue(s) for the celebrity
	 * @param type
	 *            What type of celebrity
	 */
	public void addCelebrity(String name, String guess, String type)
	{
		if(type.equals("Literature")) {
			celebGameList.add(new LiteratureCelebrity(name, guess));
		} else if (type.equals("Pet")) {
			celebGameList.add(new PetCelebrity(name, guess));
		} else {
			celebGameList.add(new Celebrity(name, guess));
		}
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name)
	{
		name = name.trim();
		if(name.length() < 4)
			return false;
		return true;
	}

	/**
	 * Checks that the supplied clue has at least 10 characters or is a series of clues
	 * This method would be expanded based on your subclass of Celebrity.
	 * @param clue The text of the clue(s)
	 * @param type Supports a subclass of Celebrity 
	 * @return If the clue is valid.
	 */
	public boolean validateClue(String clue, String type)
	{
		if(clue.length() < 10) {
			return false;
		}
		if(type.equalsIgnoreCase("literature")) {
			String[] temp = clue.split(",");
			if(temp.length>1)
				return true;
			else
				return false;
		} else if (type.equalsIgnoreCase("animal")) {
			if(clue.length() < 15)
				return false;
		}
		return true;
	}

	/**
	 * Accessor method for the current size of the list of celebrities
	 * 
	 * @return Remaining number of celebrities
	 */
	public int getCelebrityGameSize()
	{
		return celebGameList.size();
	}

	/**
	 * Accessor method for the games clue to maintain low coupling between
	 * classes
	 * 
	 * @return The String clue from the current celebrity.
	 */
	public String sendClue()
	{
		return gameCelebrity.getClue();
	}

	/**
	 * Accessor method for the games answer to maintain low coupling between
	 * classes
	 * 
	 * @return The String answer from the current celebrity.
	 */
	public String sendAnswer()
	{
		return gameCelebrity.getAnswer();
	}
}