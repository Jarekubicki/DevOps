package tematyka5.excercies.Task5_18;

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

        ValidationAndLogic executeUserChoiceToTheList = new ValidationAndLogic();
        DataInputOutput data = new DataInputOutput();

        data.printHeader();
        String userTaskToPerform = data.typedByUser();

        switch (userTaskToPerform) {
            case ("3"): {
                data.printAskForAlbumName();
                String albumToFind = data.typedByUser();
                if (executeUserChoiceToTheList.isAlbumOnTheList(playList, albumToFind)) {
                    System.out.println("Wykonawcą albumu " + albumToFind + " jest: " + playList.get(albumToFind) + ".");
                } else {
                    System.out.println("Brak danych.");
                }
                break;
            }
            case ("2"): {
                data.printAskForAlbumName();
                String albumToRemove = data.typedByUser();
                if (executeUserChoiceToTheList.isAlbumOnTheList(playList, albumToRemove)) {
                    executeUserChoiceToTheList.removeAlbumFromList(playList, albumToRemove);
                    System.out.println("Album " + albumToRemove + " has been removed from list.");
                } else {
                    System.out.println("Brak danych");
                }
                break;
            }
            case ("1"): {
                data.printAskForAlbumName();
                String albumName = data.typedByUser();

                data.printAskForAuthor();
                String author = data.typedByUser();
                playList.put(albumName, author);
                System.out.println("Album added to playlist.");
                break;
            }
            default: {
                System.out.println("No such choice available.");
            }
        }

//        if (userTaskToPerform.equals(Task.FIND_ALBUM_IN_LIST)) {
//            data.printAskForAlbumName();
//            String albumToFind = data.typedByUser();
//            if (executeUserChoiceToTheList.isAlbumOnTheList(playList, albumToFind)) {
//                System.out.println("Wykonawcą albumu " + albumToFind + " jest: " + playList.get(albumToFind) + ".");
//            } else {
//                System.out.println("Brak danych.");
//            }
//        } else if (userTaskToPerform.equals(Task.REMOVE_ENTRY_FROM_PLAYLIST)) {
//            data.printAskForAlbumName();
//            String albumToRemove = data.typedByUser();
//            if (executeUserChoiceToTheList.isAlbumOnTheList(playList, albumToRemove)) {
//                executeUserChoiceToTheList.removeAlbumFromList(playList, albumToRemove);
//                System.out.println("Album " + albumToRemove + " has been removed from list.");
//            } else {
//                System.out.println("Brak danych");
//            }
//        }
//        else if (userTaskToPerform.equals(Task.ADD_ENTRY_TO_PLAYLIST)) {
//            data.printAskForAlbumName();
//            String albumName = data.typedByUser();
//
//            data.printAskForAuthor();
//            String author = data.typedByUser();
//            playList.put(albumName, author);
//            System.out.println("Album added to playlist.");
//        }


    }
}
