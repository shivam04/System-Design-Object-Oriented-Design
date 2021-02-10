package search;

import vehicle.Vehicle;

import java.util.List;

/**
 * Created by shivam.si on 19/01/21 12:44 pm
 */
public interface Search {
    public List<Vehicle> searchByType(String type);
    public List<Vehicle> searchByModel(String model);
}
