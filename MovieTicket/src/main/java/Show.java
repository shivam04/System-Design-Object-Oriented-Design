import java.util.Date;

/**
 * Created by shivam.si on 26/02/22 12:52 pm
 */

public class Show {
    private Integer showId;
    private Date createdOn;
    private Date startTime;
    private Date endTime;
    private Movie movie;
    private CinemaHall playedAt;

    public void addShow() {
        this.movie.addShow(this);
    }
}
