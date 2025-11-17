import java.util.Scanner;

public class UserStory {
  
// Stores all Movie objects in the Movie[] array.
  public Movie[] movies;

/**
 * Calls the createMovie() method.
 */
  public UserStory(String titlesFile, String voteFile, String popFile, String yearFile) {
    this.movies = createMovie(titlesFile, voteFile, popFile, yearFile);
  }

/**
 * This method uses information from multiple text files and stores 
 * them into 1D arrays used to create the Movie object and store them in a Movie array
 */
public Movie[] createMovie(String titlesFile, String voteFile, String popFile, String yearFile) {
  String[] titles = FileReader.toStringArray(titlesFile);
  int[] vote = FileReader.toIntArray(voteFile);
  double[] popularity = FileReader.toDoubleArray(popFile);
  int[] year = FileReader.toIntArray(yearFile);
  Movie[] movieArray = new Movie[titles.length];
  for (int i = 0; i < titles.length; i++) {
    movieArray[i] = new Movie(titles[i], vote[i], popularity[i], year[i]);
  }
  return movieArray;
}

/**
 * This method manipulates and analyzes the dataset's column on popularity 
 * to sort and display a list of movies that have a popularity over and under 4500
 * Precondition: Must be a double from the popularity data text file. (As shown with the getPop()).
 * Postcondition: Displays the correct popularity for its matching index and is represented as a String.
 */

  public String filterPopularity() {
    String display = "Movies with popularity over 4500:\n";

    for (Movie m : movies) {
        if (m.getPop() >= 4500.0) {
            display += m.toString() + "\n";
        }
    }

    return display;
}

/**
 * This function uses an enhanced for-loop to format information from 1D
 * arrays into the console
 * Prints all of the values stored in the Movies[] array.
 */
  public String toString() {
    String result = "Movies: \n";
    for (Movie movie : movies) {
      result += movie + "\n";
    }
    return result;
  }

  
}