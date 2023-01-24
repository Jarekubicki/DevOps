package Task5_15;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-01-24
 */
public class ColorTest {
    public static void main(String[] args) {


        String[] colorsArray = {Colors.WHITE.getDescription(), Colors.BLACK.getDescription(), Colors.GREEN.getDescription(),
                Colors.BLUE.getDescription(), Colors.RED.getDescription(), Colors.YELLOW.getDescription(),
                Colors.ORANGE.getDescription(), Colors.PINK.getDescription()};

        ArrayList<String> colorsList = new ArrayList<>();

        for (String color : colorsArray) {
            colorsList.add(color);
        }

        iterateTheList(colorsList);
        replaceArrayListFifthElement(colorsList);
        addElementAtListBeginning(colorsList);
        sortTheList(colorsList);
        ArrayList<String> reversedColours = reverseArrayOrder(colorsList);
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

    }

    static ArrayList<String> reverseArrayOrder(ArrayList<String> list) {
        ArrayList<String> reversedColours = new ArrayList<>();
        for (int i = list.size() - 1; i > -1; i--) {
            reversedColours.add(list.get(i));
        }
        return reversedColours;
    }

}
