package user;

import vehicle.VehicleReservation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivam.si on 19/01/21 12:14 pm
 */
public class Member extends Account{
    private int totalVehiclesReserved;

    public List<VehicleReservation> getReservations() {
        return new ArrayList<>();
    }
}
