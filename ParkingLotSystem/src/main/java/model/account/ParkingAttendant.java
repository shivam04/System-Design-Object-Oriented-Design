package model.account;

/**
 * Created by shivam.si on 10/02/22 4:31 pm
 */

public class ParkingAttendant extends Account{
    public boolean processTicket(String ticketNumber) {
        parkingLot.getTicket(ticketNumber).processTicket();
        parkingLot.removeActiveTicket(ticketNumber);
        return true;
    }
}
