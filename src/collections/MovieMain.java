package collections;

import java.util.ArrayList;
import java.util.Collections;

public class MovieMain {
    public static void main(String[] args) {
        Movie m1 = new Movie(15, "Kung Fu Panda", 2008);
        Movie m2 = new Movie(22, "Serendipity", 2000);
        Movie m3 = new Movie(13, "Just Go With It", 2012);
        Movie m4 = new Movie(4, "Dead Poets Society", 1989);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);

        System.out.println("Comparable Sort");
        Collections.sort(movies);
        for(Movie m: movies){
            System.out.println(m.getReleaseYear());
        }

        System.out.println("\nComparator Sort for name");
        Collections.sort(movies, new MovieNameComparator());
        for(Movie m: movies){
            System.out.println(m.getName());
        }

        System.out.println("\nComparator Sort for id");
        Collections.sort(movies, new MovieIdComparator());
        for(Movie m: movies){
            System.out.println(m.getId());
        }
    }
}
