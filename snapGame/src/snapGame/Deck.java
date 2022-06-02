package snapGame;
import java.util.Random;

public class Deck {
	//creates card deck and returns it
	public static Card[] createDeck()
	{
		//a deck is comprised of 52 cards
		Card[] deck = new Card[52];
		//index variable
		int cardCount=0;
		//creates a card for every suit + value combination
		//there are 4 different suits and 13 different values for a card to take, 52 cards total
		for (int suit=0;suit<=3;++suit) {
			for (int value=0;value<=12;++value) {
				deck[cardCount] = new Card("","");
				(deck[cardCount]).SetSuit(suit);
				(deck[cardCount]).SetNum(value);
				//System.out.println("Card: "+(deck[cardCount]).GetSuit()+" "+(deck[cardCount]).GetNum()+" created"); 
				cardCount++;
			}
		}
		return deck;
	}
	//method used for randomising the order of cards in a deck
	//cards switch positions with a randomly chosen second card
	public static Card[] shuffle(Card[] deck)
	{
		Random rand = new Random();
		for (int i=0;i<deck.length;++i) {
			//random card from the 52 is chosen
			int x = rand.nextInt(deck.length); 
			//swap operator position i <> position x
			Card temp = new Card(deck[i].GetSuit(),deck[i].GetNum());
			deck[i]= new Card(deck[x].GetSuit(),deck[x].GetNum());
			deck[x]= new Card(temp.GetSuit(),temp.GetNum());
		}
		return deck;
	}
	//only used for test purposes
	//displays the current deck arrangement, with order
	public static void printDeck(Card[] deck)
	{
		System.out.println("Current Deck:");
		for (int i=0;i<deck.length;++i) {
			System.out.println((i+1)+": "+(deck[i]).GetSuit()+" "+(deck[i]).GetNum());
		}
	}


}
