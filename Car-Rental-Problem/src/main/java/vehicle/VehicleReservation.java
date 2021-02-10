package vehicle;

import constants.ReservationStatus;
import user.AdditionalDriver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by shivam.si on 19/01/21 12:41 pm
 */
public class VehicleReservation {
    private String reservationNumber;
    private Date creationDate;
    private ReservationStatus status;
    private Date dueDate;
    private Date returnDate;
    private String pickupLocationName;
    private String returnLocationName;

    private int customerID;
    private Vehicle vehicle;
    private Bill bill;
    private List<AdditionalDriver> additionalDrivers;
    private List<Notification> notifications;
    private List<RentalInsurance> insurances;
    private List<Equipment> equipments;
    private List<Service> services;

    public static VehicleReservation fetchReservationDetails(String reservationNumber) {
        return new VehicleReservation();
    }

    public List<Passenger> getAdditionalDrivers() {
     return new ArrayList<Passenger>();
    }
}
