/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"jack", "queen", "king"};
		String[] suits1 = {"blue", "red", "green"};
		int[] pointValues1 = {11, 12, 13};
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);
		deck1.deal();
		deck1.deal();
		System.out.print(deck1);
		System.out.print("empty: " + deck1.isEmpty() + "\n\n");

		String[] ranks2 = {"jack", "3", "6"};
		String[] suits2 = {"blue", "pink"};
		int[] pointValues2 = {11, 3, 6};
		Deck deck2 = new Deck(ranks2, suits2, pointValues2);
		deck2.deal();
		deck2.deal();
		deck2.deal();
		System.out.print(deck2);
		System.out.print("empty: " + deck2.isEmpty() + "\n\n");
		
		
		String[] ranks3 = {"5", "2"};
		String[] suits3 = {"yellow", "red", "purple"};
		int[] pointValues3 = {5, 2};
		Deck deck3 = new Deck(ranks3, suits3, pointValues3);
		deck3.deal();
		System.out.print(deck3);
		System.out.print("empty: " + deck3.isEmpty() + "\n\n");
		
		// shuffle test case
		deck3.shuffle();
		System.out.print("\n\n\n\n\n\nShuffled deck:\n\n" + deck3);
	}
}
