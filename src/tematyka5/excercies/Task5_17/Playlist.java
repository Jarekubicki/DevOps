package tematyka5.excercies.Task5_17;

import java.util.HashMap;

/**
 * Created by BIURO22 on 2023-01-25
 */
public class Playlist {
    public static void main(String[] args) {


        HashMap<String, String> playList = new HashMap<>();

        playList.put("The Sensual World", "Kate Bush");
        playList.put("Shaday", "Ofra Haza");
        playList.put("Achtung Baby", "U2");
        playList.put("Aion", "Dead Can Dance");
        playList.put("Invisible Touch", "Genesis");

        for (String title : playList.keySet()) {
            System.out.println(title);
        }


        System.out.println("\n" + "Enter album name you want find:");

        DataInput userInput = new DataInput();
        String userQuery = userInput.enterAlbumName();

        ValidationLogic albumCheck = new ValidationLogic();
        if (albumCheck.findAlbumInTheList(playList, userQuery)) {
            System.out.println("Wykonawcą albumu " + userQuery + " jest: " + playList.get(userQuery) + ".");
        }
        else  {
            System.out.println("Brak danych.");
        }
    }
}
