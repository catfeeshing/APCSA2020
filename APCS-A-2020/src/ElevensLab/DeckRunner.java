package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class DeckRunner
{
	public static void main( String args[] )
	{
		Deck test = new Deck();
		
		// - - - - - Print entire deck in order: OK
		
		System.out.println( "All cards in order." );
		for( int j = 1; j <= 52; j++ )
		{
			System.out.println( test.dealCard() );
		}
		
		test.shuffle();
		test.topReset();
		
		// - - - - - Print single random card: OK
		
		System.out.println("new");
		System.out.println(test.dealCard() + "end");
		
		// - - - - - Shuffle method test: OK
		
		test.topReset();
		test.shuffle();
		
		// - - - - - PerfectShuffle test:
		
		/*
		int[] arr = {1,2,3,4,5};
		System.out.println(arr.toString());
		Shuffler.perfectShuffle(arr);
		System.out.println(arr.toString());
		*/
	
		// - - - - - SelectionShuffle test:
		
		/*
		for( int j = 1; j <= 52; j++ )
		{
			System.out.println( test.dealCard() );
		}
		*/
		
		// - - - - -
		
		//test.shuffle();	
		
		//System.out.println( "\n\nAll cards after shuffling." );
		//for( int j = 1; j <= 52; j++ )
		//{
		//	System.out.println( test.dealCard() );
		//}				
	}
}