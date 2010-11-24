import java.util.Scanner;
import java.lang.Math;

/**
 * Print each player's bowling average for a match and the team's average.
 * - from ./readme
 *   "The average is the sum of the game scores divided by the number of
 *   games."
 */
public class BowlingCalc {
  double MAXSCORE = 300;
  double TEAMSIZE = 5;
  double GAMEQTY  = 3;
  public static void main(String[] args) {
    String intro  = "I will calculate the averages for the bowling team and its";
           intro += " players.\n";
    System.out.printf(intro);

    double[][] team = {
      {290, 250, 100},
      {100,  30,  15},
      {230, 100,  90},
      {  4,  50,  20},
      {300, 300,   1}
    };
  }

  protected static void playerAverage(double[] member) {
    //
  }

  protected static void teamAverage(double[][] team) {
    //
  }
}
