package tematyka8.excercises.Task8_4;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Test {
    public static void main(String[] args) {

        TramDepot tramDepot1 = new TramDepot("Depot North", new ArrayList<>());
        Tramway tram1 = new Tramway(120, 11, tramDepot1, 2);


    }
}
