package ElevensLab;

import java.util.Arrays;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 2;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 52;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println(weightedCoin());
		int[] arrayOne = {87,3434,1};
		int[] arrayTwo = {1,3434,87};
		System.out.println(arePermutations(arrayOne, arrayTwo));
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		// Initialize shuffled to contain 52 empty elements.
		int[] shuffled = new int[VALUE_COUNT];
		
		
		// Set k to 0.
		int k = 0;
		
		// For j = 0 to 25:
		for (int j = 0; j <= 25; j++) {
			// Copy cards[j] to shuffled[k]
			shuffled[k] = values[j];
			// Set k to k+2
			k = k+2;
		}
		//Set k to 1.
		k = 1;
		for (int j = 26; j <= 51; j++) {
			shuffled[k] = values[j];
			k = k+2;
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		//int[] shuffled = new int[52];
		for (int k = 51; k <= 1; k--) {
			int r = (int) (Math.random()*k);
			values[k] = values[r];
		}
	}
	
	// Weighted Coin Simulation
	public static String weightedCoin() {
		int num = (int) (Math.random()*3);
		if (num == 2) {
			return "tails";
		}
		return "heads";
	}
	
	// arePermutations to test for permutations
	public static boolean arePermutations(int[] arrayOne, int[] arrayTwo) {
		int[] arrOne = new int[arrayOne.length];
		for (int i = 0; i < arrayOne.length; i++ ) {
			arrOne[i] = arrayOne[i];
		}
		
		int[] arrTwo = new int[arrayTwo.length];
		for (int i = 0; i < arrayTwo.length; i++) {
			arrTwo[i] = arrayTwo[i];
		}
	
		
		/*
		Arrays.sort(arrOne);
		Arrays.sort(arrTwo);
		*/
		int arrOneLength = arrOne.length;
		for (int i = 0; i < arrOneLength-1; i++) {
			int min = i;
			for (int j = i + 1; j < arrOneLength; j++) {
				if (arrOne[j] < arrOne[min]) {
					min = j;
					
					int temp = arrOne[min];
					arrOne[min] = arrOne[i];
					arrOne[i] = temp;
				}
			}
		}
		
		int arrTwoLength = arrTwo.length;
		for (int i = 0; i < arrTwoLength-1; i++) {
			int min = i;
			for (int j = i + 1; j < arrTwoLength; j++) {
				if (arrTwo[j] < arrTwo[min]) {
					min = j;
					
					int temp = arrTwo[min];
					arrTwo[min] = arrTwo[i];
					arrTwo[i] = temp;
				}
			}
		}
		
		
		int count = 0;
		for (int i = 0; i < arrOne.length; i++) {
			if (arrOne[i] == arrTwo[i]) {
				count++;
			}
		}
		if (count == arrOne.length) {
			return true;
		}
		return false;
	}
}
