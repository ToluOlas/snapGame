package snapGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTest {
	//Test of the "GetSuit" getters ability to return the correct card suit
	@Test
	void testGetSuit() {
		Card testCard = new Card("Diamond","TEN");
		assertEquals("Diamond",testCard.GetSuit());
	}
	//Test of the "SetSuit" setter's ability to change the suit of a card
	//Suits are represented by a number from 0-3 in this method
	// 0 = Diamond
	// 1 = Heart
	// 2 = Spade
	// 3 = Club
	@Test
	void testSetSuit() {
		Card testCard = new Card("Diamond","TEN");
		testCard.SetSuit(2);//2 = Spade
		assertEquals("Spade",testCard.GetSuit());
	}
	//Test of the "GetNum" getters ability to return the correct card value 
	@Test
	void testGetNum() {
		Card testCard = new Card("Diamond","TEN");
		assertEquals("TEN",testCard.GetNum());
	}
	//Test of the "SetNum" setter's ability to change the value of a card
	//Values are represented by a number from 0-12 in this method
	// 0-8 = all numbers from TWO to TEN inclusive
	// 9 = JACK  
	// 10 = QUEEN
	// 11 = KING
	// 12 = ACE
	@Test
	void testSetNum() {
		Card testCard = new Card("Diamond","TEN");
		testCard.SetNum(5);//5 = SEVEN
		assertEquals("SEVEN",testCard.GetNum());
	}

}
