package tematyka7.excercises.Task7_9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by BIURO22 on 2023-02-01
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();
    private final int deckSize = Card.SUITES.length * Card.VALUES.length;
    private Random random = new Random();

    public void createDeck() {

        for (int i = 0; i < Card.VALUES.length; i++) {
            for (int j = 0; j < Card.SUITES.length; j++) {
                deck.add(new Card(Card.VALUES[i], Card.SUITES[j]));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card pickRandomCardFromDeck() {
        return deck.get(random.nextInt(deckSize));
    }

    public Card getLastCardInDeck() {
        return deck.get(deck.size() - 1);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
