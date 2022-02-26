import java.util.Date;
import java.util.List;

/**
 * Created by shivam.si on 26/02/22 2:14 pm
 */

public interface Search {
    public List<Movie> searchByTitle(String title);
    public List<Movie> searchByCity(String cityName);
    public List<Movie> searchByGenre(String genre);
    public List<Movie> searchByReleaseDate(Date releaseDate);
    public List<Movie> searchByLanguage(String language);
}
