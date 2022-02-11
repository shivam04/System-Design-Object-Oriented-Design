package model;

import model.constants.ParkingTicketStatus;

import java.util.Date;

/**
 * Created by shivam.si on 10/02/22 6:01 pm
 */

public class ParkingTicket {
    private ParkingTicketStatus parkingTicketStatus;
    private double cost;
    private Date createdAt;
    private Date releaseDate;
    private String ticketNumber;
    private ParkingRate parkingRate;

    public void saveInDB() {
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void processTicket() {
        this.releaseDate = new Date();
        this.cost = (releaseDate.getHours() - createdAt.getHours())*parkingRate.getRate();
        this.updateInDB();
    }

    private void updateInDB() {
    }
}
