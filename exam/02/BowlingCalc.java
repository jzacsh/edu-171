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

    double[][] members = new Array[team.length];

    double teamAvg = teamAverage(team);

    System.out.printf("::the average for the team was: %.2f\n", teamAvg);
    System.out.printf("::member averages:\n");
    // loop through member.length:
    for () {
      // print each member's score and their index for reference
      System.out.printf("%d, %.2f", i, member[i]);
    }
  }

  protected static void playerAverage(double[] member) {
    for () {
      // i hAz all y0ur logix
    }
  }

  /**
   * @param  double[][]  entire team data set
   * @param  double[][]  blank slate to store each member's average
   */
  protected static double teamAverage(double[][] team, double[] members) {
    double sum = 0;
    // loop through each member
    for (int i = 0; i < team.length; i++) {
      // loop through current member's scores
      for (int m = 0; m < team[m].length; m++) {
      }
      // - store the results of the member in the member's avg in members[] array
      // - add member's average to sum
    }

    return sum / team[0].length;
  }
}
