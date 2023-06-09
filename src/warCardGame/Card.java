package warCardGame;

class Card {
	private int value; // value = 2-14 representing 2-Aces
	private String name; // number and suite (ex. Two of Hearts) 
	
	public Card(int value, String name) { //constructor used to set the value and name of the card 
		this.value = value;
		this.name = name;
	}
	public int getValue() { // method returns value of card
		return value;
	}
	public String getName() { //method returns the name of the card
		return name;
	}
	public void describe() { // responsible for printing out the name of the card
		System.out.println(name);
	}

}
