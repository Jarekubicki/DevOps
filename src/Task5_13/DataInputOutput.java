package Task5_13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by BIURO22 on 2023-01-19
 */
public class DataInputOutput {



    public void printEntryMessage() {
        System.out.println("Type the word to add to the list:");
    }

    public String enterTheWord() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void printUserWordsListLength(ArrayList<String> wordList) {
        System.out.println("Number of words entered by user = " + wordList.size());
    }

    public void printListFirstElement(ArrayList<String> wordList) {
        System.out.println("First user word on the list is: " + wordList.get(0));
    }

    public void printListLastElement(ArrayList<String> wordList) {
        System.out.println("Last user word on the list is: " + wordList.get(wordList.size() - 1));
    }

    public void printListMiddleElement(int middleElement, ArrayList<String> wordList) {
        System.out.println("Middle element of user word list is: " + wordList.get(middleElement));
    }
}
