package snapGame;

public class snapGame {

	public static void main(String[] args) {
		//Upon game start:
		//* create card deck
		System.out.println("Creating deck...");
		
		//deck is an array of Card objects 
		Card[] playingDeck = Deck.createDeck();
		
		//* shuffle deck
		System.out.println("Shuffling deck...");
		playingDeck = Deck.shuffle(playingDeck);
		
		//52 cards in a deck, 26 for each player
		//Cards at arr[0, 2, 4, 6, ..., 50] are for player 1
		//Cards at arr[1, 3, 5 ,7, ..., 51] are for player 2
		int currentCard;
		boolean isSnap=false;
		for (int i=0;i<(playingDeck.length)/2;++i) {
			currentCard= i*2;
			//checks currentCard and the card next to it in the array
			isSnap=compareCards(playingDeck[currentCard],playingDeck[currentCard+1]);
			
			//game ending condition
			if (isSnap==true) {
				System.out.println("Snap!");
				break;
			}
			
		}
		//if statement to identify a game ending via empty deck
		if (isSnap == false) {
			System.out.println("No matches, ending game...");
		}
	}
	
	//compareCards declares the cards drawn by each player
	//decides if the game ends or not depending on the cards being played
	//game ends upon the returning of true
	public static boolean compareCards(Card p1, Card p2)
	{
		//current cards being played are displayed
		System.out.println("Player 1 plays: "+p1.GetNum()+" of "+p1.GetSuit()+"s!");
		System.out.println("Player 2 plays: "+p2.GetNum()+" of "+p2.GetSuit()+"s!");
		System.out.println("");
		//SNAP conditions:
		//*cards are the same number or both aces (if statement also includes same face cards, slight redundancy)
		if (p1.GetNum()==p2.GetNum()) {
			return true;
		}
		//*cards are both face cards, regardless of if they're the same face
		if ( (p1.GetNum()=="JACK"||p1.GetNum()=="QUEEN"||p1.GetNum()=="KING") && (p2.GetNum()=="JACK"||p2.GetNum()=="QUEEN"||p2.GetNum()=="KING") ) {
			return true;
		}
		//reached if no snap occurs
		return false;
	}

}
