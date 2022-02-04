/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("J", "hearts", 10);
		Card card2 = new Card("Q", "spades", 11);
		Card card3 = new Card("J", "hearts", 10);
		
		System.out.print(card1 + "\n");
		System.out.print(card2 + "\n");
		System.out.print(card3 + "\n");
		
		System.out.print(card1.matches(card2) + "\n");
		System.out.print(card1.matches(card3) + "\n");
	}
}
