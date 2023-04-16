package Sprint5;
import java.util.Scanner;

public class Game {

	private int score;
	private Card currentCard;
	private Card nextCard;
	private Deck deck = new Deck();
	private Scanner scan1 = new Scanner(System.in);

	public void gameTurn() {
		currentCard = deck.getNextCard();
		System.out.println("De Score is: " + score + " De kaart is: " + currentCard.toString());
		System.out.println("hoger of lager");
		
		String answer = scan1.nextLine();
		nextCard = deck.getNextCard();
		
		if(answer.equals("hoger") && nextCard.HigherOrEqual(currentCard)) {
			correct();
			}
		else if(answer.equals("lager")&& !nextCard.HigherOrEqual(currentCard)) {
			correct();
			} 
		else {
			incorrect();
			}
		}

	public void correct(){
		score++;
		}

	public void incorrect() {
		score--;
		System.out.println("Het is fout, de kaart was: " + nextCard.toString());
		}

	public boolean stillPlayable() {
		if (deck.AreCardsLeft()) {
			return true;
		} else {
			return false;
		}
	}
	public int getScore() {
		return score;
		}
	}