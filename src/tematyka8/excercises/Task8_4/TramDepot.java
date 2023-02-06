package tematyka8.excercises.Task8_4;

import java.util.ArrayList;

/**
 * Created by BIURO22 on 2023-02-06
 */
public class TramDepot extends Depot {


    ArrayList<Tramway> tramListAssignedToDepot;

    public TramDepot(String name, ArrayList<Tramway> tramListAssignedToDepot) {
        super(name);
        this.tramListAssignedToDepot = tramListAssignedToDepot;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String depotCategory = this.getClass().getSimpleName();
        System.out.println("depot type = " + depotCategory);
        System.out.println("Tramways assigned to depot: ");
        for (Tramway tram : tramListAssignedToDepot) {
            System.out.println(tram.toString());
        }
    }

    public ArrayList<Tramway> getTramListAssignedToDepot() {
        return tramListAssignedToDepot;
    }

    public void setTramListAssignedToDepot(ArrayList<Tramway> tramListAssignedToDepot) {
        this.tramListAssignedToDepot = tramListAssignedToDepot;
    }
}
