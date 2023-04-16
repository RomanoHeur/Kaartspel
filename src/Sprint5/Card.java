package Sprint5;

public class Card {
	 Suit suit;
	 Value value;
	
	public Card(Suit suit, Value v) {
		this.suit = suit;
		this.value = v;
	}
	
	public String toString() {
		return suit + " " + value + " (" + value.numericalValue + ") ";
	}
	
	public boolean HigherOrEqual(Card c) {
		if(this.value.numericalValue >= c.value.numericalValue) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
