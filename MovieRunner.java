import java.util.Scanner;

/**
 * This function uses an enhanced for-loop to format information from 1D
 * arrays into the console
 */
public class MovieRunner {
  public static void main(String[] args) {

UserStory one = new UserStory("titles.txt", "voteCount.txt", "popularityData.txt", "year.txt");

/**
 * First line: Calls and prints the toString from the UserStory class
 * Second line: Calls and prints the filterPopularity() method from the UserStory class
 */
System.out.println(one);
System.out.println(one.filterPopularity());
    
    
  }
}