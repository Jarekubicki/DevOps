package tematyka8.excercises.Task8_4;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class Test {
    public static void main(String[] args) {

        Tramway tram1 = new Tramway(120, 11, "depot North", 2);
        Tramway tram2 = new Tramway(100, 8, "depot North", 3);
        Tramway tram3 = new Tramway(80, 12, "depot North", 2);

        ArrayList<Tramway> tramList = new ArrayList<>();
        tramList.add(tram1);
        tramList.add(tram2);
        tramList.add(tram3);

        TramDepot tramDepot1 = new TramDepot("depotNorth");

        for(Tramway tramway : tramList) {
            tramDepot1.addVehicle(tramway);
        }

        tramDepot1.showInfo();


    }
}
