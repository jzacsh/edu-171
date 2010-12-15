import java.util.Scanner;
import java.lang.Math;

/**
 * Print each player's bowling average for a match and the team's average.
 * - from ./readme
 *   "The average is the sum of the game scores divided by the number of
 *   games."
 */
public class que14 {
  public static void main(String[] args) {
    for (int i=0; i < 10; i++)
      for (int j=0; j < i; j++)
        System.out.printf("%d\n", i*j);
  }
}
