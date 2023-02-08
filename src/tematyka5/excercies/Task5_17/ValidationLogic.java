package tematyka5.excercies.Task5_17;

import java.util.HashMap;

/**
 * Created by BIURO22 on 2023-01-25
 */
public class ValidationLogic {


    public boolean findAlbumInTheList(HashMap<String, String> albumsList, String albumToFind) {
        return albumsList.containsKey(albumToFind);
    }
}
