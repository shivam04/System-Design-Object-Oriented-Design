import java.util.Date;
import java.util.List;

/**
 * Created by shivam.si on 26/02/22 12:55 pm
 */

public class Booking {
    private Integer bookingId;
    private  Integer numberOfSeats;
    private Date createdOn;
    private BookingStatus status;
    private Show show;
    private List<CinemaHallSeat> seats;
    private Payment payment;

    public boolean makeBooking(Payment payment) {
        this.payment = payment;
        payment.makePayment();
        return true;
    }

    public boolean cancel() {
        return true;
    }
    public boolean assignSeats(List<CinemaHallSeat> seats) {
        this.seats.addAll(seats);
        return true;
    }
}
