package warCardGame;

import java.util.ArrayList;
import java.util.List;

class Player {
	private List<Card> hand; // supposed to represent a players hand
	private int score; // represents players score
	private String name; // represents players name
	
	public Player(String name) {//constructor of the player class called when a new player object is created
		this.name = name;
		hand = new ArrayList<>();
		score = 0;
	}
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand: ");
		for (Card card : hand) { // prints players name, score, and hand by using the describe method of each card
			card.describe();
		}
		System.out.println();
	}
	public Card flip() { // represents the action of turning a card over
		if (hand.isEmpty()) {
			return null;
		}
		return hand.remove(0);
	}
	public void draw(Deck deck) { // drawing a card from the deck
		Card card = deck.draw();
		if (card != null) {
			hand.add(card);
		}
	}
	public void incrementScore() { // increments score by 1
		score++;
	}
	public int getScore() {
		return score;
	}

}
