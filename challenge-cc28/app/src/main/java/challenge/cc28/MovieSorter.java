package challenge.cc28;

import java.util.Arrays;
import java.util.List;

public class MovieSorter {

        public static Movie[] sortByYear(Movie[] movies) {
            Arrays.sort(movies, (a, b) -> b.getYear() - a.getYear());  // takes an array as its first argument "movies", The second argument is a comparator function or lambda expression that defines how the sorting should be done.
            return movies; // It subtracts the release year of movie a from the release year of movie b. This subtraction
                           // determines the order in which the movies should be sorted.
            // -ve b>a >>>> b a sorted (descending)
            // +ve a>b >>>> a b (ascending)
}
    public static Movie[] sortAlphabeticallyByTitle(Movie[] movies) {
        Arrays.sort(movies, (a, b) -> {
            String titleA = a.getTitle().replaceFirst("^(?i)(A|An|The) ", "");
            String titleB = b.getTitle().replaceFirst("^(?i)(A|An|The) ", "");
            return titleA.compareToIgnoreCase(titleB);
        });
        return movies;
    }

}







