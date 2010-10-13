import java.util.Scanner;

/**
 * Class for managing a given week of employee hours.
 *   prints string a table displaying the total hours worked by each employee
 *   for a given week.
 * - course:     COMP-171-801RL
 * - assignment: pg 207; que. #6.23; due: 12/07
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @return void
 */
public class WeekHours {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int emps = 8;
    int days = 7;
    double totals[][]  = new double[emps][2];

    //@TODO: randomly, dymaically generate this:
    double[][] staff = {
        { 2,  4,  3,  4,  5,  8,  8},
        { 7,  3,  4,  3,  3,  4,  4},
        { 3,  3,  4,  3,  3,  2,  2},
        { 9,  3,  4,  7,  3,  4,  1},
        { 3,  5,  4,  3,  6,  3,  8},
        { 3,  4,  4,  6,  3,  4,  4},
        { 3,  7,  4,  8,  3,  8,  4},
        { 6,  3,  5,  9,  2,  7,  9}
      };

    for (int e = 0; e < totals.length; e++) {
      totals[e][0] = Total(staff[e]); // employee's hours
      totals[e][1] = e;               // employee's index
    }

    //pass staff[][] and totals[] to Sort() method to be printed.
    double sorted[][] = new double[totals.length][totals[0].length];
    Sort(totals, sorted);

    String header = "em |  su  m   t   w   th  f   sa | [totals]\n";
    header += "-------------------------------------------";
    System.out.printf("%s\n", header);
    int current;
    for (int e = 0; e < totals.length; e++) {
      System.out.printf("%1.0f | ", sorted[e][1]);
      current = (int)sorted[e][1];
      for (int i = 0; i < staff[current].length; i++)
        System.out.printf(" %2.0f ", staff[current][i]);
      System.out.printf(" |   %2.2f\n", sorted[e][0]);
    }
  }

  /**
   * Prints strings passed in if internal boolean is set.
   *
   * @param string debug statement
   * @return void
   */
  public static void OldDebug(String dbg) {
    if (true)
      System.out.printf("\nDEBUG:\t%s\n", dbg);
  }

  /**
   *
   */
  public static void Sort(double[][] totals, double[][] sorted) {
    double sentinal = -1;
    double largest = sentinal;
    int current = 0;
    for (int s = 0; s < sorted.length; s++) {
      for (int i = 0; i < totals.length; i++) {
        if (totals[i][0] > largest && totals[i][0] != sentinal) {
          sorted[s][0] = totals[i][0];
          sorted[s][1] = totals[i][1];
          largest = totals[i][0];
          current = i;
        }
      }
      totals[current][0] = sentinal;
      largest = sentinal;
    }
    return;
  }

  /**
   * Sort and Print a given array representing another two dimensional array of data.
   *
   * @param  double array of values to sort and base the print off of.
   * @param  double two dimensional array to be printed
   * @return void
   */
  public static void SortOld(double[] weight, double[][] data) {
    int largest = -99;
    int size = weight.length;
    boolean finished = false;
    double total = 0;
    double sentinal = -1;

    OldDebug("size of array of totals is: "+size+".\n");

    //print table header
    String header = "em |  su   m   t   w  th   f  sa  (totals)\n";
          header += "--------------------------------";
    System.out.printf("%s", header);
    do {
      //find the next hardest working employee
      for (int i = 0; i < size; i++) {
        finished = true;
        //is this the hardest working employee, so far?
        if (weight[i] != sentinal && weight[i] >= largest) {
          OldDebug("weight["+i+"] = "+weight[i]+" is, so far, the largest.");
          largest = i;
          total = weight[i];
          weight[i] = sentinal;
          finished = false;
        }
      }

      OldDebug("weight["+largest+"] = "+total+" _is_ the largest.");
      //print next hardest working employee's hours
      if (!finished) {
        System.out.printf("\n%1x  | ", largest, data[largest]);
        int amt = data[largest].length;
        for (int s = 0; s < amt; s++)
          System.out.printf("  %-2.0f", data[largest][s]);
        System.out.printf(" (%2.2f)", total);
      }

    } while(!finished);

    System.out.printf("\n");
  }

  /**
   * Sums the values in any given array.
   *
   * @param  double array of doubles.
   * @return double sum of an array.
   */
  public static double Total(double[] values) {
    double total = 0;
    int size = values.length;
    for (int i = 0; i < size; i++)
      total += values[i];
    return total;
  }
}
