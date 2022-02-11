package model.account;

import model.EntrancePanel;
import model.ExitPanel;
import model.ParkingFloor;
import model.parkingspot.ParkingSpot;

/**
 * Created by shivam.si on 10/02/22 4:27 pm
 */

public class Admin extends Account{
    public boolean addParkingFloor(ParkingFloor parkingFloor) {
        parkingLot.addParkingFloor(parkingFloor);
        return true;
    }
    public boolean addParkingSpot(String floorName, ParkingSpot spot) {
        parkingLot.getParkingFloor(floorName).addParkingSpot(spot);
        return true;
    }

    public boolean addEntrancePanel(EntrancePanel entrancePanel) {
        parkingLot.addEntrancePanel(entrancePanel);
        return true;
    }
    public boolean addExitPanel(ExitPanel exitPanel) {
        parkingLot.addExitPanel(exitPanel);
        return true;
    }
}
