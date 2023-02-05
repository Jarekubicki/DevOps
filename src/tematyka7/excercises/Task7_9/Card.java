package tematyka7.excercises.Task7_9;

/**
 * Created by BIURO22 on 2023-02-01
 */
public class Card {
    private String value;
    private String suite;

    public Card(String value, String suite) {
        this.value = value;
        this.suite = suite;
    }

    public Card() {
    }

    private final String[] SUITES = {"Diamond", "Clubs", "Spades", "Hearts"};
    private final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String[] getSUITES() {
        return SUITES;
    }

    public String[] getVALUES() {
        return VALUES;
    }

    @Override
    public String toString() {
        return "Card: " + value + "-" + suite;
    }
}

