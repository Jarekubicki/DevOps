package tematyka5.excercies.Task5_18;

import java.util.HashMap;

/**
 * Created by BIURO22 on 2023-01-25
 */
public class ValidationAndLogic {


    public boolean isAlbumOnTheList(HashMap<String, String> albumsList, String albumToFind) {
        return albumsList.containsKey(albumToFind);
    }

    public void removeAlbumFromList(HashMap<String, String> albumsList, String albumToRemove) {
        albumsList.remove(albumToRemove);
    }


}
