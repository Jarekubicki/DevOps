package tematyka5.excercies.Task5_18;

import java.util.Scanner;

/**
 * Created by BIURO22 on 2023-01-25
 */
public class DataInputOutput {

    public String typedByUser() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }


    public void printHeader() {
        System.out.println("\nChoose action to perform:");
        System.out.println("Type 1 to: " + Task.ADD_ENTRY_TO_PLAYLIST);
        System.out.println("Type 2 to: " + Task.REMOVE_ENTRY_FROM_PLAYLIST);
        System.out.println("Type 3 to: " + Task.FIND_ALBUM_IN_LIST);
    }

    public void printAskForAlbumName() {
        System.out.println("\nEnter album name:");
    }
    public void printAskForAuthor() {
        System.out.println("\nEnter author");
    }


}
