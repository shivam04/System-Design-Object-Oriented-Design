import java.util.List;

/**
 * Created by shivam.si on 26/02/22 12:44 pm
 */

public class Customer extends Account{
    List<Booking> bookingList;
    public boolean makeBooking(Booking booking) {
        bookingList.add(booking);
        return true;
    }

    public List<Booking> getBookings() {
        return bookingList;
    }
}
