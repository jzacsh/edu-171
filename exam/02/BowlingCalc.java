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

    // get input, team's sores.
    // @TODO: hardcoded, get from stdin
    double[][] team = {
      {290, 250, 100},
      {100,  30,  15},
      {230, 100,  90},
      {  4,  50,  20},
      {300, 300,   1}
    };

    // data structure to store individual member's averages
    double[][] members = new Array[team.length];
    double teamAvg = teamAverage(team, members);

    // print results
    System.out.printf("::the average for the team was: %.2f\n", teamAvg);
    System.out.printf("::member averages:\n");
    // loop through member.length:
    for (int i = 0; i < members.length; i++) {
      // print each member's score and their index for reference
      System.out.printf("%d, %.2f", i, member[i]);
    }
  }

  /**
   * Averages an array of scores for a given member.
   *
   * @param   double  scores: an array of a player's scores.
   * @param   double  vals: an empty 2-d array to fill with the return
   * @return  void    by ref: an average of the scores passed in.
   * - two-dimensional array of scores
   *   -   0 => sum
   *   -   1 => average
   */
  protected static void playerAverage(double[] scores, double[][] vals) {
    // loop through current member's scores
    double sum = 0;
    for (int m = 0; m < member.length; m++) {
      sum += member[m];
    }

    // mean algorithm
    member[0] = sum;
    member[1] = sum / member.length;
  }

  /**
   * Calculates average of the entire teams scores. Also uses empty array
   * passed by reference to store each member's individual average
   *
   * @param  double[][]  entire team data set.
   * @param  double[]    empty array to store each member's average.
   * @return double      average of the entire team's scores.
   */
  protected static double teamAverage(double[][] team, double[] members) {
    double sum = 0;
    // loop through each member
    for (int i = 0; i < team.length; i++) {
      double[][] scores = new Array(team[i].length);
      playerAverage(team[i], scores);
      sum += scores[i][0];
      members[i][1] = scores[i][1];
      //unset the var for next loop
      scores = NULL;
    }

    // mean algorithm
    return sum / team[0].length;
  }
}
