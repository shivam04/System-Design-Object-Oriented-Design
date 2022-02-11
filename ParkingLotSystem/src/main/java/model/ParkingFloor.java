package model;

import model.parkingspot.*;
import model.vehicle.Vehicle;

import java.util.HashMap;

/**
 * Created by shivam.si on 10/02/22 4:39 pm
 */

public class ParkingFloor {
    private String name;
    private HashMap<String, ElectricSpot> electricSpots;
    private HashMap<String, CompactSpot> compactSpots;
    private HashMap<String, RegularSpot> regularSpots;
    private HashMap<String, LargeSpot> largeSpots;


    public ParkingFloor(String name) {
        this.name = name;
    }

    public void addParkingSpot(ParkingSpot spot) {
        switch (spot.getType()) {
            case COMPACT:
                compactSpots.put(spot.getNumber(), (CompactSpot) spot);
                break;
            case LARGE:
                largeSpots.put(spot.getNumber(), (LargeSpot) spot);
                break;
            case REGULAR:
                regularSpots.put(spot.getNumber(), (RegularSpot) spot);
                break;
            case ELECTRIC:
                electricSpots.put(spot.getNumber(), (ElectricSpot) spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
        spot.assignVehicle(vehicle);
    }

    public void freeSpot(ParkingSpot spot) {
        spot.removeVehicle();
    }

    public void saveInDB() {
    }

    public boolean isFull() {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, ElectricSpot> getElectricSpots() {
        return electricSpots;
    }

    public void setElectricSpots(HashMap<String, ElectricSpot> electricSpots) {
        this.electricSpots = electricSpots;
    }

    public HashMap<String, CompactSpot> getCompactSpots() {
        return compactSpots;
    }

    public void setCompactSpots(HashMap<String, CompactSpot> compactSpots) {
        this.compactSpots = compactSpots;
    }

    public HashMap<String, RegularSpot> getRegularSpots() {
        return regularSpots;
    }

    public void setRegularSpots(HashMap<String, RegularSpot> regularSpots) {
        this.regularSpots = regularSpots;
    }

    public HashMap<String, LargeSpot> getLargeSpots() {
        return largeSpots;
    }

    public void setLargeSpots(HashMap<String, LargeSpot> largeSpots) {
        this.largeSpots = largeSpots;
    }
}
