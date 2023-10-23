# MovieSorter

Movie Sorter is a utility class for sorting an array of Movie objects by various criteria.

## Usage

- Created the following methods to sort the movies:

    - `MovieSorter.sortByYear(Movie[] movies)`: Sorts movies by year in descending order.

    - `MovieSorter.sortAlphabeticallyByTitle(Movie[] movies)`: Sorts movies alphabetically by title while ignoring common articles like "A," "An," and "The."

  **The sorted movies will be updated in the same array you passed to the sorting method.**

## Efficiency 
   - Time Complexity: `O(n * log(n))` due to the sorting algorithm used by `Arrays.sort`. 
   - Space Complexity: `O(log(n))` Both methods use the merge sort algorithm for sorting. The space complexity depends 
                       on the depth of the recursive call stack, This space is used to manage the recursive calls and 
                       the sub problems during the sorting process.

## Example

```java
import java.util.Arrays;

public class MyMovieApp {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("The Matrix", 1999, new String[]{"Action", "Sci-Fi"}),
            new Movie("Avatar", 2009, new String[]{"Action", "Adventure", "Sci-Fi"}),
            new Movie("Inception", 2010, new String[]{"Action", "Sci-Fi"})
        };

        // Sort movies by year
        MovieSorter.sortByYear(movies);

        // Sort movies alphabetically by title
        MovieSorter.sortAlphabeticallyByTitle(movies);

        // Access the sorted movies as needed
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }
    }
}
```

 


