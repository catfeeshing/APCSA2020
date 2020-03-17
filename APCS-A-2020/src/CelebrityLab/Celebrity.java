package CelebrityLab;
/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	
	private String celebClue;
	
	/**
	 * The answer or name of the celebrity.
	 */
	
	private String name;
	
	private String type;
	
	/**
	 * 
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		setAnswer(answer);
		setClue(clue);
	}
	
	public Celebrity(String answer, String clue, String celebType) {
		setAnswer(answer);
		setClue(clue);
		setType(celebType);
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return celebClue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return name.trim();
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		celebClue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		name = answer;
	}
	
	public void setType(String celebType) {
		type = celebType;
	}
	
	public String getType() {
		return type;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return name;
	}
	
}
