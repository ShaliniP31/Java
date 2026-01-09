package collections;

import java.util.Comparator;

public class MovieIdComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
