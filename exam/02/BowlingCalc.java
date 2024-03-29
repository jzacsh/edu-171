import java.util.Scanner;
import java.lang.Math;

/**
 * Print each player's bowling average for a match and the team's average.
 * - from ./readme
 *   "The average is the sum of the game scores divided by the number of
 *   games."
 */
public class BowlingCalc {
  //setting constants:
  public static final double MAXSCORE = 300;
  public static final    int TEAMSIZE = 5;
  public static final    int GAMEQTY  = 3;

  public static void main(String[] args) {
    String intro  = "I will calculate the averages for the bowling team and its";
           intro += " players.\n";
    System.out.printf(intro);

    // get input, team's sores.
    // @TODO: hardcoded, get from stdin
    double[][] team = {
      {290, 250, 100},
      {100,  30,  15},
      {230, 100,  90},
      { 50,  50,  50}, // <-- control data
      {300, 300,   1}
    };

    // data structure to store individual member's averages
    double[][] members = new double[team.length][TEAMSIZE];
    double teamAvg = teamAverage(team, members);

    // print results
    String table_horiz = "--------------------\n";
    System.out.printf("%s", table_horiz);
    System.out.printf("team average: %6.2f\n", teamAvg);
    System.out.printf("%s", table_horiz);
    System.out.printf("| member | average |\n");
    System.out.printf("%s", table_horiz);
    // loop through member.length:
    for (int i = 0; i < members.length; i++) {
      // print each member's score and their index for reference
      System.out.printf("|%7d : %7.2f |\n", i+1, members[i][1]);
    }
    System.out.printf("%s", table_horiz);
  }

  /**
   * Averages an array of scores for a given member.
   *
   * @param   double  scores: an array of a player's scores.
   * @param   double  vals: an empty array to fill with the return
   * @return  void    by ref: an average of the scores passed in.
   * - two-dimensional array of scores
   *   -   0 => sum
   *   -   1 => average
   */
  protected static void playerAverage(double[] scores, double[] vals) {
    // loop through current member's scores
    double sum = 0;
    for (int m = 0; m < scores.length; m++) {
      sum += scores[m];
    }

    // mean algorithm
    vals[0] = sum;
    vals[1] = sum / scores.length;
  }

  /**
   * Calculates average of the entire teams scores. Also uses empty array
   * passed by reference to store each member's individual average
   *
   * @param  double[][]  entire team data set.
   * @param  double[]    empty array to store each member's sum and average
   * @return double      average of the entire team's scores.
   */
  protected static double teamAverage(double[][] team, double[][] members) {
    double sum = 0;
    // loop through each member
    for (int i = 0; i < team.length; i++) {
      double[] scores = new double[team[i].length];
      playerAverage(team[i], scores);
      sum += scores[0];
      members[i][1] = scores[1];
      //unset the var for next loop
      scores = null;
    }

    // mean algorithm
    return sum / team[0].length;
  }
}
