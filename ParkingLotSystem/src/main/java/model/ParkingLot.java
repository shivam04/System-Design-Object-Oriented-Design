package model;

import exception.ParkingFullException;
import model.constants.Address;
import model.constants.VehicleType;
import model.vehicle.Vehicle;

import java.util.HashMap;

/**
 * Created by shivam.si on 10/02/22 5:58 pm
 */

public class ParkingLot {
    private String name;
    private Address address;
    private ParkingRate parkingRate;

    private int compactSpotCount;
    private int largeSpotCount;
    private int regularSpotCount;
    private int electricSpotCount;
    private final int maxCompactCount = 100;
    private final int maxLargeCount = 100;
    private final int maxRegularSpotCount = 100;
    private final int maxElectricCount = 100;

    private HashMap<String, EntrancePanel> entrancePanels;
    private HashMap<String, ExitPanel> exitPanels;
    private HashMap<String, ParkingFloor> parkingFloors;
    private HashMap<String, ParkingTicket> activeTickets;

    private static ParkingLot parkingLot = null;

    private ParkingLot() {
        // 1. initialize variables: read name, address and parkingRate from database
        // 2. initialize parking floors: read the parking floor map from database,
        //  this map should tell how many parking spots are there on each floor. This
        //  should also initialize max spot counts too.
        // 3. initialize parking spot counts by reading all active tickets from database
        // 4. initialize entrance and exit panels: read from database
    }

    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public synchronized ParkingTicket getNewParkingTicket(Vehicle vehicle) throws ParkingFullException {
        if (this.isFull(vehicle.getType())) {
            throw new ParkingFullException();
        }
        ParkingTicket ticket = new ParkingTicket();
        vehicle.assignTicket(ticket);
        ticket.saveInDB();
        // if the ticket is successfully saved in the database, we can increment the parking spot count
        this.incrementSpotCount(vehicle.getType());
        this.activeTickets.put(ticket.getTicketNumber(), ticket);
        return ticket;
    }

    private void incrementSpotCount(VehicleType type) {
        if(type == VehicleType.VAN) {
            largeSpotCount++;
        } else if (type == VehicleType.MOTORCYCLE) {
            if(compactSpotCount < maxCompactCount)
                compactSpotCount++;
            regularSpotCount++;
        } else if (type == VehicleType.CAR) {
            if(regularSpotCount < maxRegularSpotCount)
                regularSpotCount++;
            largeSpotCount++;
        } else {
            electricSpotCount++;
        }

    }

    private boolean isFull(VehicleType type) {
        if(type == VehicleType.VAN) {
            return largeSpotCount>=maxLargeCount;
        }

        if (type == VehicleType.MOTORCYCLE) {
            return (compactSpotCount + regularSpotCount) >= (maxCompactCount + maxRegularSpotCount);
        }

        if (type == VehicleType.CAR) {
            return (regularSpotCount + largeSpotCount) >= (maxRegularSpotCount + maxLargeCount);
        }

        return electricSpotCount >= maxElectricCount;
    }

    public boolean isFull() {
        for (String key : parkingFloors.keySet()) {
            if (!parkingFloors.get(key).isFull()) {
                return false;
            }
        }
        return true;
    }

    public void addParkingFloor(ParkingFloor floor) {
        floor.saveInDB();
        parkingFloors.put(floor.getName(), floor);
    }

    public void addEntrancePanel(EntrancePanel entrancePanel) {
        entrancePanel.saveInDB();
        entrancePanels.put(entrancePanel.getName(), entrancePanel);
    }

    public void addExitPanel(ExitPanel exitPanel) {
        exitPanel.saveInDB();
        exitPanels.put(exitPanel.getName(), exitPanel);
    }

    public ParkingFloor getParkingFloor(String name) {
        return parkingFloors.get(name);
    }

    public ParkingTicket getTicket(String ticketNumber) {
        return activeTickets.get(ticketNumber);
    }

    public void removeActiveTicket(String ticketNumber) {
        activeTickets.remove(ticketNumber);
    }
}
