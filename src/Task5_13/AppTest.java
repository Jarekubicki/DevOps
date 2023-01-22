package Task5_13;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-01-19
 */
public class AppTest {
    public static void main(String[] args) {

        final String KEY_WORD = "STOP";
        ArrayList<String> wordList = new ArrayList<>();
        DataInputOutput dataEntry = new DataInputOutput();
        String userWord;

        do {
            dataEntry.printEntryMessage();
            userWord = dataEntry.enterTheWord();
            if (!userWord.equalsIgnoreCase(KEY_WORD)) {
                wordList.add(userWord);
            }
        } while (!userWord.equalsIgnoreCase(KEY_WORD));

        int middleElementOfList = (wordList.size() / 2);

        dataEntry.printUserWordsListLength(wordList);
        dataEntry.printListFirstElement(wordList);
        dataEntry.printListLastElement(wordList);
        dataEntry.printListMiddleElement(middleElementOfList, wordList);
    }
}
