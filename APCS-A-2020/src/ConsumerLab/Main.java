package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		//System.out.println(Review.totalSentiment("src/ConsumerLab/cleanSentiment.csv"));
		
		//printy print
		System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
		System.out.println(Review.starRating("src/ConsumerLab/simpleReview.txt"));
		//System.out.println(Review.fakeReview("src/ConsumerLab/simpleReview.txt"));
		//System.out.println(Review.positiveReview("src/ConsumerLab/simpleReview.txt"));
		//System.out.println(Review.negativeReview("src/ConsumerLab/simpleReview.txt"));
		// read in the positive adjectives in postiveAdjectives.txt
		//? is this the intention System.out.println(Review.totalSentiment("src/ConsumerLab/positiveAdjectives.txt"));
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
