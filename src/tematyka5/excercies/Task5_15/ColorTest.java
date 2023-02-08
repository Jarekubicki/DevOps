package tematyka5.excercies.Task5_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by BIURO22 on 2023-01-24
 */
public class ColorTest {
    public static void main(String[] args) {


        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList("white", "black", "green", "blue", "red",
                "yellow", "orange", "pink"));

        iterateTheList(colorsList);
        replaceArrayListFifthElement(colorsList);
        addElementAtListBeginning(colorsList);
        sortTheList(colorsList);
        reverseArrayOrder(colorsList);
    }


    static void iterateTheList(ArrayList<String> list) {
        for (String arrayElement : list) {
        }
    }

    static void replaceArrayListFifthElement(ArrayList<String> list) {
        list.set(4, "lilac");
    }

    static void addElementAtListBeginning(ArrayList<String> list) {
        list.add(0, "turquoise");
    }

    static void sortTheList(ArrayList<String> list) {
        Collections.sort(list);

    }

    static void reverseArrayOrder(ArrayList<String> list) {
        Collections.reverse(list);
    }

}
