package tematyka5.excercies.Task5_18;

/**
 * Created by BIURO22 on 2023-01-25
 */
public enum Task {

    ADD_ENTRY_TO_PLAYLIST("1"),
    REMOVE_ENTRY_FROM_PLAYLIST("2"),
    FIND_ALBUM_IN_LIST("3");

    private String action;

    Task(String action) {
        this.action = action;
    }


}
