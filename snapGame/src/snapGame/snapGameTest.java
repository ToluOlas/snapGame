package snapGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class snapGameTest {
	//card comparison tests
	//the method returns true if a snap has occurred, false otherwise
	//the snap conditions:
	//*cards are the same number value, or both aces
	//*cards are both face cards (Jack, Queen or King), regardless of if they're the same face
	@Test
	void testCompareCards() {
		//testing 2-10/Ace snap condition
		Card testCard1 = new Card("Diamond","THREE");
		Card testCard2 = new Card("Spade", "THREE");
		assertEquals(true,snapGame.compareCards(testCard1, testCard2));
		
		testCard1 = new Card("Club","ACE");
		testCard2 = new Card("Heart", "ACE");
		assertEquals(true,snapGame.compareCards(testCard1, testCard2));
	}
	
	@Test
	void testCompareCards2() {
		//testing face card condition
		Card testCard1 = new Card("Diamond","JACK");
		Card testCard2 = new Card("Spade", "QUEEN");
		assertEquals(true,snapGame.compareCards(testCard1, testCard2));
		
		testCard1 = new Card("Club","KING");
		testCard2 = new Card("Heart", "QUEEN");
		assertEquals(true,snapGame.compareCards(testCard1, testCard2));
	}
	//test for false condition
	//if the values of the cards do not match/are not both faces. the players must continue to compare cards
	@Test
	void testCompareCards3() {
		//testing face card condition
		Card testCard1 = new Card("Club","NINE");
		Card testCard2 = new Card("Club", "EIGHT");
		assertEquals(false,snapGame.compareCards(testCard1, testCard2));
	}

}
