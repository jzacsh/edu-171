import java.util.Scanner;
import java.lang.Math;

public class InvestmentValueLab05 {
  public static void main(String[] args) {
    // start professor requisite //////////////////////////////////////////
    String intro = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "\npg 163; que. #5.7; due: 11/02\n";
    // end professor requisite ////////////////////////////////////////////

    //explain program
    String summary = "I'm an investment calculator. All I need is the interest rate and duration (in years).\n";
    System.out.printf("%s\n%s", intro, summary);


    double investment, interest, value = 0;
    int dur = 0;

    System.out.printf("Years  Future Value\n");
    //get input
    double[] data;
    data = new double[2];
    getData(data);
    for (dur = 1; dur <= 30; dur++) {
      //run algorithm
      value = futureInvestmentValue(data[0], data[1], dur);
      System.out.printf("%d        $%.2f\n", dur, value);
    }
  }

  /**
   * Calculates future investment on the following basic algorithm, broken down
   * futher in inline comments:
   *    investmentAmount * ((1 + monthlyInterestRate ) ^ (numberOfYears * 12))
   *
   * @param double investment amount
   * @param double interest rate
   * @param int    duration of the loan, in years.
   * @return double  future investment.
   */
  public static double futureInvestmentValue(
      double investmentAmount, double monthlyInterestRate, int years) {

    // investmentAmount * (1 + ((monthlyInterestRate * 0.01) /12 ) ) ^ (numberOfYears * 12)
    double rate = (0.01 * monthlyInterestRate) / 12;
    double base =  1 + rate;
    int exp = years * 12;
    double tmp = Math.pow(base, exp);
    return investmentAmount * tmp;
  }

  /**
   * Prompts user, on command line, for Investment Value (%) and Interest Rate ($).
   *
   * @param double a (preferrably) empty array of doubles for data to be passed
   * back in.
   * @return void
   */
  public static void getData(double[] data) {
    Scanner stdin  = new Scanner(System.in);
    System.out.printf("Investment    : $");
    data[0] = stdin.nextDouble();
    System.out.printf("Interest      : %%");
    data[1] = stdin.nextDouble();
    return;
  }
}
