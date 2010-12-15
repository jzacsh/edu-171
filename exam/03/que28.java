import java.util.Scanner;
import java.lang.Math;

/**
 * Print each player's bowling average for a match and the team's average.
 * - from ./readme
 *   "The average is the sum of the game scores divided by the number of
 *   games."
 */
public class que28 {
  public static void main(String[] args) {
    Count myCount = new Count();
    int times = 0;

    for (int i = 0; i < 100; i++)
      increment(myCount, times);

    System.out.println("myCount.count = " + myCount.count);
    System.out.println("times = " + times);
  }

  public static void increment(Count c, int times) {
    c.count++;
    times++;
  }
}

class Count {
  int count;

  Count(int c) {
    count = c;
  }

  Count() {
    count = 1;
  }
}
