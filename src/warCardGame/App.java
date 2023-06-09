package warCardGame;

public class App {//Main portion of the program that will run the game
				  //Makes use of the following classes: Card, Deck, and Player
	public static void main(String[] args) {
		Deck deck = new Deck(); //making a new deck of cards
		Player player1 = new Player("Player 1"); //creation of player 1
		Player player2 = new Player("Player 2");//creation of player 2
		
		deck .shuffle();//shuffling deck of cards
		
		for (int i = 0; i < 52; i++) {//loops through the 52 cards
			if (i % 2 == 0) {
			player2.draw(deck);//player 2 draws a card
			} else {
			player1.draw(deck);//player 1 draws a card
			}
		}
		
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();//retrieving a card from player 1 hand
			Card card2 = player2.flip();//retrieving a card from player 2 hand
			
			if (card1 == null || card2 == null) {//shows if there are not enough cards to play the round
				System.out.println("Not enough cards to play the round.");
			}	
			
			card1.describe();//details of cards1 displayed
			card2.describe();//details of cards2 displayed
			
			if (card1.getValue() > card2.getValue()) {// if player1 card is more value than player 2
				player1.incrementScore();//player 1 score increase
				System.out.println("Player 1 wins the round");//shows if player 1 wins the round
			} else if (card1.getValue() < card2.getValue()) {// if player1 card is less value than player 2
				player2.incrementScore();//player 2 score increase
				System.out.println("Player 2 wins the round");//shows if player 2 wins the round
			} else {
				System.out.println("It is a draw");//shows if both drawn cards are equal in value "Draw"
			}
			
			player1.describe();//prints the description of the card1 to the console
			player2.describe();//prints the description of the card2 to the console
		}
		
		int player1Score = player1.getScore();//designates player 1 score
		int player2Score = player2.getScore();//designates player 2 score
		
		System.out.println("Final Score:");//for these three: displays the final scores for each player
		System.out.println("Player 1: " + player1Score);
		System.out.println("Player 2: " + player2Score);
		
		if (player1Score > player2Score) {//if player 1 score is higher, player 1 wins
			System.out.println("Player 1 wins!");
		} else if (player1Score < player2Score) {//if player 2 score is higher, player 2 wins
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("It's a draw!");//if player 1 score = player 2 score: it will print "It's a draw!"
		}
		
				

	}

}
