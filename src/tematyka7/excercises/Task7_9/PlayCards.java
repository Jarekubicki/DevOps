package tematyka7.excercises.Task7_9;

/**
 * Created by BIURO22 on 2023-02-02
 */
public class PlayCards {
    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.createDeck();
        System.out.println("Deck created: " + deck.getDeck().toString());

        deck.shuffleDeck();
        System.out.println("Shuffled deck: " + deck.getDeck().toString());

        Card randomCard = deck.pickRandomCardFromDeck();
        System.out.println("Random card picked from deck: " + randomCard.toString());

        Card lastCard = deck.getLastCardInDeck();
        System.out.println("Last card (from shuffled deck): " + lastCard.toString());
    }
}
