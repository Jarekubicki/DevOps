package tematyka7.excercises.Task7_9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by BIURO22 on 2023-02-01
 */
public class Deck {

    private Card card = new Card();
    private ArrayList<Card> deck = new ArrayList<>();
    private final int DECK_SIZE = card.getSUITES().length * card.getVALUES().length;

    public void createDeck() {

        for (int i = 0; i < card.getVALUES().length; i++) {
            for(int j = 0; j < card.getSUITES().length; j++) {
                String value = card.getVALUES()[i];
                String suite = card.getSUITES()[j];
                card = new Card(value, suite);
                deck.add(card);
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card pickRandomCardFromDeck() {
        Random random = new Random();
        int index = random.nextInt(DECK_SIZE);
        return deck.get(index);
    }

    public Card getLastCardInDeck() {
        return deck.get(deck.size() - 1);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
