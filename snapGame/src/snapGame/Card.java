package snapGame;

public class Card {
	private String cardSuit;
	private String cardVal;
	Card(String n,String a)
	{
		cardSuit = n;
		cardVal = a;
	}
	//card suit getter
	public String GetSuit()
	{
		return(cardSuit);
	}
	//card suit setter
	public void SetSuit(int suitNum)
	{
		//4 suits total, 0 to 3
		// suits[0] = Diamond
		// suits[1] = Heart
		// suits[2] = Spade
		// suits[3] = Club
		String[] suits = {"Diamond","Heart","Spade","Club"};
		cardSuit = suits[suitNum];
	}
	//card number/value getter
	public String GetNum()
	{
		return(cardVal);
	}
	//card number/value setter
	public void SetNum(int cardNum)
	{
		//13 values total, 0 to 12
		// values[0-8] = all numbers from TWO to TEN inclusive
		// values[9] = JACK  
		// values[10] = QUEEN
		// values[11] = KING
		// values[12] = ACE
		String[] values = {"TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"};
		cardVal = values[cardNum];
	}

}
