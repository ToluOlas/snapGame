Description:

•	Create a class that can represent a Playing Card, as found in a regular deck of playing cards.

  o	Cards can be one of four suits: Diamond, Heart, Spade, Club.
  
  o	Cards can be numbered 2-10, Jack, Queen, King, and Ace. 
  
•	Create a function that can simulate a single game of Simple Snap!, with the following logic:

  o	Initialize a deck of 52 cards where every card is unique.
  
  o	Deal a random hand of cards to two players. Each player receives 26 cards.
  
  o	One by one, simulate the players comparing cards. For each comparison, output the two cards being compared.
  
    	If the two cards match, output Snap! and end the game,.
    
    	If you run out of cards without any matches, end the game.
    
  o	Cards match if:
  
    	They are both the same number, or both Aces
    
    	They are both face cards, i.e. Jack, Queen or King. They do not have to both be the same face card (e.g. a Jack can match with a Queen).
    
    
To run the game of Snap, run the snapGame.java file. 

Created in eclipse, test files require JUnit 5 for Java.
