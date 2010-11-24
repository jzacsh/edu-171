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
    double teamAvg = teamAverage(team, members);

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
   * @param  double  an array of a player's scores.
   * @return double  an average of the scores passed in.
   */
  protected static double playerAverage(double[] member) {
    // loop through current member's scores
    double sum = 0;
    for (int m = 0; m < member.length; m++) {
      sum += member[m];
    }
    return sum / member.length
  }

  /**
   * Calculates average of the entire teams scores. Also uses empty array
   * passed by reference to store each member's individual average
   *
   * @param  double[][]  entire team data set.
   * @param  double[][]  blank slate to store each member's average.
   * @return double      average of the entire team's scores.
   */
  protected static double teamAverage(double[][] team, double[] members) {
    double sum = 0;
    // loop through each member
    for (int i = 0; i < team.length; i++) {
      members[i] = playerAverage(team[i]);
      sum += team[i];
    }

    return sum / team[0].length;
  }
}
