package snapGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeckTest {
	//deck creation test
	//decks are composed of 52 cards, all being unique
	//there are 4 possible suit parameters and 13 possible value parameters
	//upon initialisation, suits are ordered Diamond > Heart > Spade > Club
	//upon initialisation, values are ordered TWO-TEN > JACK > QUEEN > KING > ACE
	//suit order is prioritised over value order (All Diamonds > All Hearts etc)
	//using this, we can determine where each unique card SHOULD be
	//e.g. Card: Diamond TWO, would be the first card in the deck array (deck[0])
	//likewise, Card: Club ACE, would be the final card (deck[51])
	@Test
	void testCreateDeck() {
		Card[] testDeck = Deck.createDeck();
		assertEquals("Diamond",testDeck[0].GetSuit());
		assertEquals("TWO",testDeck[0].GetNum());
	}
	
	@Test
	void testCreateDeck2() {
		Card[] testDeck = Deck.createDeck();
		assertEquals("Club",testDeck[51].GetSuit());
		assertEquals("ACE",testDeck[51].GetNum());
	}
	//e.g find Spade FOUR
	//Spade is the third suit so spades start at the ((13*2)+1=) 27th card
	//FOUR is the third value in the card value sequence (3rd card in the subset of suits) so 
	//Spade FOUR is the 29th card (or deck[28])
	@Test
	void testCreateDeck3() {
		Card[] testDeck = Deck.createDeck();
		assertEquals("Spade",testDeck[28].GetSuit());
		assertEquals("FOUR",testDeck[28].GetNum());
	}
}
