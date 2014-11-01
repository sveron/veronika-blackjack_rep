package basic;
/*
 * @author sveron
 */
public class Card {
/*
 * the suit of the card (clubs, diamonds, hearts or 
 */
private Suit suit; 
/*
 * the value of the card
 * Ace is 11 or 1, Jack-King: 11-13
 */
private int value;

@Override
public String toString() {
	return "Card [suit=" + suit + ", value=" + value + "]";
}

public Suit getSuit() {
	return suit;
}
public void setSuit(Suit suit) {
	//FIXME be sure suit is not null
	this.suit = suit;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}

public Card(Suit suit, int value) {
	this.suit = suit;
	this.value = value;
}

public static void main(String[] args) {
	//Prints the string
    System.out.println("I'm an expert!"); 
}	
}

