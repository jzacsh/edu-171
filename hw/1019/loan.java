import java.util.Scanner;
import java.lang.Math;
import java.io.*;

/**
 * Given a user-provided loan -amount and -period, calculates and returns
 * possible Monthly payments and Total payments based on the loan duration and
 * a range of hardcoded interest rates from 5-8% at .125% increments.
 *   prints string Table of possible monthly and total payments based on a
 *   range of interest rates.
 * - course:     COMP-171-801RL
 * - assignment: pg 125; que. #4.21; due: 10/19  (lab# 04)
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @return void
 */


public class loan {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    String intro = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "pg 125; que. #4.21; due: 10/19  (lab# 04)\n";
    String summary = "\nI'm a loan calculator.";
    summary += "\nI'll tell you the Monthly Payments at various interest rates,";
    summary += "\ngiven a loan aount and loan duration.\n";
    System.out.printf("\n%s\n%s", intro, summary);
    int dura = 0; // years
    double loan = 0;

    //get variable information
    if (args.length == 4) {
      //command-line params
      int i;
      for (i=0; i < args.length; i++) {
        if (args[i].contentEquals("-l")) {
          try {
            loan = Float.valueOf(args[++i]);
          }
          catch(Exception e) {
            System.err.printf("ERROR: Value for 'loan' is not a valid number.\n\t%s\n", e);
            loan = 0;
            break;
          }
        }
        else if (args[i].contentEquals("-r")) {
          try {
            dura = Integer.valueOf(args[++i]);
          }
          catch(Exception e) {
            System.err.printf("ERROR: Value for 'duration' is not a valid number.\n\t%s\n", e);
            dura = 0;
            break;
          }
        }
      }
      if (dura == 0 || loan == 0) {
        String usage = "usage:\t -l [loan] -r [rate]\n\tinvoked without parameters, will default to interactive mode.";
        System.err.printf("\nERROR: Necessary values not set.\n%s\n", usage);
        System.exit(1);
      }
    }
    else {
      //interactive mode
      System.out.printf("Please input the loan amount:   $");
      try {
        loan = stdin.nextFloat();
      }
      catch (Exception e) {
        System.err.printf("ERROR: Value for 'loan' is not a valid number.\n\t%s\n", e);
        loan = 0;
      }

      if (loan != 0) {
        System.out.printf("Please input the duration of the loan (years): ");
          try {
            dura  = stdin.nextInt();
          }
          catch (Exception e) {
            System.err.printf("ERROR: Value for 'duration' is not a valid number.\n\t%s\n", e);
            dura = 0;
          }
      }

      if (dura == 0 || loan == 0) {
        String usage = "usage:\t -l [loan] -r [rate]\n\tinvoked without parameters, will default to interactive mode.";
        System.err.printf("\nERROR: Necessary values not set.\n%s\n", usage);
        System.exit(1);
      }
    }

    //print table
    String head_title  = "-- loan summary: --------------------------------------------------";
    String head_border = "-------------------------------------------------------------------";

    System.out.printf("\n%s\n", head_border);
    System.out.printf("%s\n",   head_title);
    System.out.printf("Loan Amount    : %-64f\n", loan);
    System.out.printf("Number of Years: %-64x\n", dura);

    System.out.printf("%s\n", head_border);

    String head_rate    = "(%) Interest Rate";
    String head_monthly = "($) Monthly Payment";
    String head_total   = "($) Total Payment";
    System.out.printf("%-23s", head_rate);
    System.out.printf("%-25s", head_monthly);
    System.out.printf("%-18s\n", head_total);

    //looped data calc and output
    double current, powow, mrate, monthly;
    int payments = (dura * 12);

    for (double rate = 5; rate <= 8; rate += 0.125) {
      current = (rate / 100);
      mrate = current / 12;
      //print results for this interest rate:
      powow   = Math.pow((1 + mrate), payments);
      monthly = (loan * mrate * powow) / (powow -1);
      System.out.printf(" %-22.4f", current * 100);
      System.out.printf(" %-25.2f", monthly);
      System.out.printf("%16.2f\n", monthly * (double)payments);
    }
    System.out.printf("%s\n", head_border);
  }
}
