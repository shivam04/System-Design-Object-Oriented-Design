package search;

import vehicle.Vehicle;

import java.util.HashMap;
import java.util.List;

/**
 * Created by shivam.si on 19/01/21 12:44 pm
 */
public class VehicleInventory implements Search{

    private HashMap<String, List<Vehicle>> vehicleTypes;
    private HashMap<String, List<Vehicle>> vehicleModels;

    @Override
    public List<Vehicle> searchByType(String query) {
        return vehicleTypes.get(query);
    }

    @Override
    public List<Vehicle> searchByModel(String query) {
        return vehicleModels.get(query);
    }
}
