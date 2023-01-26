package tematyka5.excercies.Task5_20;

import java.util.*;

/**
 * Created by BIURO22 on 2023-01-26
 */
public class ColorsCollection {
    public static void main(String[] args) {

        ArrayList<String> colorsArray = new ArrayList<>(Arrays.asList("zielony", "czerwony", "niebieski", "czarny",
                "fioletowy", "granatowy", "niebieski", "czarny", "czarny", "zielony", "cytrynowy", "granatowy",
                "niebieski", "indygo", "zielony", "czerwony"));

        HashSet<String> colorsSet = new HashSet<>(Set.copyOf(colorsArray));

        System.out.println("Number of elements in array = " + colorsArray.size());
        System.out.println("Number of unique elements in array = " + colorsSet.size());

        for (String colors : colorsSet) {
            System.out.println(colors);
        }
        System.out.println();


        colorsSet.add("pink");
        for (String colors : colorsSet) {
            System.out.println(colors);
        }
        System.out.println();

        colorsSet.remove("czarny");
        for (String colors : colorsSet) {
            System.out.println(colors);
        }

    }

}
