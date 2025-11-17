public class Movie {
  
/**
 * Creates the instance variables that go 
 * into each Movie object
 */
private String title;
private int count;
private double pop;
private int year;

/**
 * Used to actually fill the Movie object
 */
  public Movie(String title, int count, double pop, int year) {
    this.title = title;
    this.count = count;
    this.pop = pop;
    this.year = year;
  }

/**
 * Public getter methods used to get the values for each aspect
 * of the Movie objects and be used outside of the Movie class
 */
  public String getTitle() {
    return title;
  }

  public int getCount() {
    return count;
  }

  public double getPop() {
    return pop;
  }

  public int getYear() {
    return year;
  }

/**
 * Format of how each Movie object should be displayed and allows
 * make it easier to be printed.
 */
  public String toString() {
    return "Title: " + title + " - Number of votes: " + count + " - Popularity: " + pop + " - Year Released: " + year;
  }


}