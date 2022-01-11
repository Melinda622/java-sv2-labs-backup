package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    List<Movie> films = new ArrayList<>();

    public void addMovie(Movie movie) {
        films.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> result = new ArrayList<>();
        for (Movie m : films) {
            if (m.getRating() > 3 && m.getCategory().equals(category)) {
                result.add(m);
            }
        }
        return result;
    }

    public List<Movie> getFilms() {
        return films;
    }
}
