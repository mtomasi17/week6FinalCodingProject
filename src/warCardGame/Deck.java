package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {
	private List<Card> cards;
	
	public Deck() { // constructs the deck
		cards = new ArrayList<>(); //new ArrayList that provides storage for the cards
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};// array contains the suits of the Cards 
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};// Array contains names of the cards
		
		for (String suit : suits) { // iterates over each element in suits
			for (int i = 2; i <= 14; i++) { // inner loop iterates 2 to 14.  variable i is placeholder for value of the card
				String name = names[i-2] + " of " + suit; //creates the descriptive name of the card
				Card card = new Card(i, name); //creates a new Card object using the Card Constructor
				cards.add(card); // adds the newly created card to the cards list
			}
		}
	}
public void shuffle() {
	Collections.shuffle(cards); //method shuffles the order of the cards
}
public Card draw() { //Method allows you to draw a card from the deck
	if (cards.isEmpty()) { // if no more cards in deck returns null
		return null;
	}
	return cards.remove(0);
}
}
