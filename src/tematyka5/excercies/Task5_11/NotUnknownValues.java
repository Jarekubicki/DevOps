package tematyka5.excercies.Task5_11;

/**
 * Created by BIURO22 on 2023-01-19
 */
public class NotUnknownValues {
    public static void main(String[] args) {

        String[][] names2D = {{"John", "Jasper"}, {"Casper", "Jonathan"}, {"Unknown", "Unknown"}, {"Alice", "Bob"},
                {"Stanley", "Unknown"}};

        for(int i = 0; i < names2D.length; i++) {
            for(int j = 0; j < names2D[i].length; j++) {
                if (!names2D[i][j].contains("Unknown")) {
                    System.out.println(names2D[i][j]);
                }
            }
        }

    }
}
