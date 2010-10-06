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
    int emps, days;
    emps = days = 7;
    double staff[][] = new double[emps][days];
    double totals[] = new double[emps];

    //@TODO: randomly, dymaically generate this:
    staff[0] = { 2,  4,  3,  4,  5,  8,  8};
    staff[1] = { 7,  3,  4,  3,  3,  4,  4};
    staff[2] = { 3,  3,  4,  3,  3,  2,  2};
    staff[3] = { 9,  3,  4,  7,  3,  4,  1};
    staff[4] = { 3,  5,  4,  3,  6,  3,  8};
    staff[5] = { 3,  4,  4,  6,  3,  4,  4};
    staff[6] = { 3,  7,  4,  8,  3,  8,  4};
    staff[7] = { 6,  3,  5,  9,  2,  7,  9};

    for (int e = 0; e < emps; e++) {
      // build a new array called totals[]
      System.out.printf("Employee #%x's total hours: %.2f\n", e, Total(staff[e])); //debug run
    }

    //pass staff[][] and totals[] to Sort() method to be printed.
    Sort(totals, staff);
  }

  /**
   * Sort and Print a given array representing another two dimensional array of data.
   *
   * @param  double array of values to sort and base the print off of.
   * @param  double two dimensional array to be printed
   * @return void
   */
  public static void Sort(double[] weight, double[][] data) {
    //
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
