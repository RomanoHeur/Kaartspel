package Sprint5;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> cards = new ArrayList<>();

	public Deck() {
		for (Suit s : Suit.values()) {
			for (Value v : Value.values()) {
				Card card = new Card(s, v);
				cards.add(card);
				}
			}
		Collections.shuffle(cards);
		}

	public Card getNextCard() {
		cards.remove(0);
		return cards.get(0);
		}
	
	public ArrayList<Card> getCards() {
		return cards;
		}
	
	public boolean AreCardsLeft() {
		if (cards.size() > 2) {
			return true;
			}
		return false;
		}
}