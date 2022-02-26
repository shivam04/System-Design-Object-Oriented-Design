import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shivam.si on 26/02/22 2:15 pm
 */

public class SearchCache implements Search{

    HashMap<String, List<Movie>> searchTitles;
    HashMap<String, List<Movie>> searchCity;
    HashMap<String, List<Movie>> searchGenre;
    HashMap<String, List<Movie>> searchReleaseDate;
    HashMap<String, List<Movie>> searchLanguage;

    @Override
    public List<Movie> searchByTitle(String title) {
        return searchTitles.get(title);
    }

    @Override
    public List<Movie> searchByCity(String cityName) {
        return searchCity.get(cityName);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return searchGenre.get(genre);
    }

    @Override
    public List<Movie> searchByReleaseDate(Date releaseDate) {
        return searchReleaseDate.get(releaseDate);
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return searchLanguage.get(language);
    }
}
