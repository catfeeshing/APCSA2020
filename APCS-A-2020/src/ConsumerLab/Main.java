package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		System.out.println(Review.totalSentiment("src/ConsumerLab/cleanSentiment.csv"));
		
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();

			}
			input.close();
		} 
		catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}

	}
}