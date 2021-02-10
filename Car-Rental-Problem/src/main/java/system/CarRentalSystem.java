package system;

import java.util.List;

/**
 * Created by shivam.si on 19/01/21 12:31 pm
 */
public class CarRentalSystem {
    private String name;
    private List<CarRentalLocation> locations;

    public boolean addNewLocation(CarRentalLocation location) {
         this.locations.add(location);
         return true;
    }
}
