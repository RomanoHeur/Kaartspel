package Starter;

import Sprint5.Card;
import Sprint5.Deck;
import Sprint5.Game;

public class Starter {
	public static void main(String[] args) {
		Game game = new Game();
		while(game.stillPlayable()) {
		game.gameTurn();
		
		}
	}
}
