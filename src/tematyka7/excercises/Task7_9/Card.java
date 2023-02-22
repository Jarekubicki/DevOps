package tematyka7.excercises.Task7_9;

/**
 * Created by BIURO22 on 2023-02-01
 */
public class Card {
    private String value;
    private String suite;

    static final String[] SUITES = {"Diamond", "Clubs", "Spades", "Hearts"};
    static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


    public Card(String value, String suite) {
        this.value = value;
        this.suite = suite;
    }


    @Override
    public String toString() {
        return "Card: " + value + "-" + suite;
    }
}

