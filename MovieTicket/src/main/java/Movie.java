import java.util.Date;
import java.util.List;

/**
 * Created by shivam.si on 26/02/22 12:49 pm
 */

public class Movie {
    private Integer movieId;
    private String movieTitle;
    private String description;
    private Integer durationInMins;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;

    List<Show> showList;

    public boolean addShow(Show show) {
        showList.add(show);
        return true;
    }

    public List<Show> getShows() {
        return showList;
    }
}
