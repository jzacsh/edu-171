import java.util.Scanner;
import java.lang.Math;

/**
 * Print each player's bowling average for a match and the team's average.
 * - from ./readme
 *   "The average is the sum of the game scores divided by the number of
 *   games."
 */
public class que31 {
  public static void main(String[] args) {
    Count myCount = new Count();
    System.out.println("myCount.count = " + myCount.count);
  }
}

class Count {
  int count = 57;
}
/*
class Count {
  int count;

  Count(int c) {
    count = c;
  }

  Count() {
    count = 1;
  }
}
*/
