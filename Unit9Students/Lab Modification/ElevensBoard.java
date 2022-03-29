import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */

public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 	System.out.print("Name: Elias Dobrin, Period: 1, Date: 3/25/2022, Number: #37");
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		/*
		if(containsPairSum11(selectedCards) || containsJQK(selectedCards))
		{
			return true;
		}*/
		
		if(containsTripletSum11(selectedCards) || containsPairSameFaceCards(selectedCards))
		{
			return true;
		}
		
		System.out.print("Sorry you lose");
		return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		return isLegal(cardIndexes());
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		for(int n1 = 0; n1 < selectedCards.size(); n1++)
		{
			for(int n2 = n1 + 1; n2 < selectedCards.size(); n2++)
			{
				if(POINT_VALUES[selectedCards.get(n1)] + POINT_VALUES[selectedCards.get(n2)] == 11)
				{
					return true;
				}
			}
		}
		
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		boolean hasJack = false;
		boolean hasQueen = false;
		boolean hasKing = false;
		
		for(int n : selectedCards)
		{
			if(RANKS[n].equals("jack"))
			{
				hasJack = true;
			}
			
			else if(RANKS[n].equals("queen"))
			{
				hasQueen = true;
			}
			
			else if(RANKS[n].equals("king"))
			{
				hasKing = true;
			}
		}
		
		if(hasJack && hasQueen && hasKing)
		{
			return true;
		}
		
		return false;
	}
	
	private boolean containsTripletSum11(List<Integer> selectedCards)
	{
		for(int a = 0; a < selectedCards.size(); a++)
		{
			for(int b = a + 1; b < selectedCards.size(); b++)
			{
				for(int c = b + 1; c < selectedCards.size(); c++)
				{
					if(POINT_VALUES[selectedCards.get(a)] + POINT_VALUES[selectedCards.get(b)] + POINT_VALUES[selectedCards.get(c)] == 11)
					{
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	private boolean containsPairSameFaceCards(List<Integer> selectedCards)
	{
		for(int a = 0; a < selectedCards.size(); a++)
		{
			if(POINT_VALUES[selectedCards.get(a)] == 0)
			{
				for(int b = a + 1; b < selectedCards.size(); b++)
				{
					if(POINT_VALUES[selectedCards.get(b)] == 0)
					{
						return true;
					}
				}
			}
		}
		
		return false;
	}
}
