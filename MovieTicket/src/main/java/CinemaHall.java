import java.util.List;

/**
 * Created by shivam.si on 26/02/22 12:54 pm
 */

public class CinemaHall {
    private String name;
    private int totalSeats;

    private List<CinemaHallSeat> seats;
    private List<Show> shows;


    public List<CinemaHallSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<CinemaHallSeat> seats) {
        this.seats = seats;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
