package vehicle;

import constants.VehicleStatus;

import java.util.List;

/**
 * Created by shivam.si on 19/01/21 12:37 pm
 */
public abstract class Vehicle {
    private String licenseNumber;
    private String stockNumber;
    private int passengerCapacity;
    private String barcode;
    private boolean hasSunroof;
    private VehicleStatus status;
    private String model;
    private String make;
    private int manufacturingYear;
    private int mileage;

    private List<VehicleLog> log;

    public boolean reserveVehicle() {
        return true;
    }

    public boolean returnVehicle() {
        return true;
    }
}
