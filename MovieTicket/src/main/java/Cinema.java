import java.util.List;

/**
 * Created by shivam.si on 26/02/22 12:53 pm
 */

public class Cinema {
    private String name;
    private Integer totalCinemaHalls;
    private Address location;
    private List<CinemaHall> halls;

    public List<CinemaHall> getHalls() {
        return halls;
    }

    public void setHalls(List<CinemaHall> halls) {
        this.halls = halls;
    }
}
