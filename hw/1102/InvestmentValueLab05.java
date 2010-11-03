/*
11-02  Investments (5)
  pg 163 #5.7

Computing the future investment value
Write a method that computes future investment value at a given interest rate
for a specified number of years. the future investment is determined using the
formula in Exercise 2.9:
  futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) ^ (numberOfYears * 12)

Use the following method header:
  public static double futureInvestmentValue(
    double investmentAmount, double monthlyInterestRate, int years)

For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59

write a test program that prompts the user to enter the investment amount
(eg.: 1000) and the interest rate (eg.: 9%), and print a table that displays
future value for the years from 1 to 30, as shown below:

  The amount invested: 1000
  Annual interest rate: 9%
  Years   Future Value
   1       1093.8
   2       1196.41
   ...     
   29      13467.25
   30      14730.57
*/
import java.util.Scanner;
import java.lang.Math;

public class InvestmentValueLab05 {
  public static void main(String[] args) {
    Scanner stdin  = new Scanner(System.in);
    // start professor requisite //////////////////////////////////////////
    String intro = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "\npg 163; que. #5.7; due: 11/02\n";
    // end professor requisite ////////////////////////////////////////////
    String summary = "I'm an investment calculator. All I need is the interest rate and duration (in years).\n";
    System.out.printf("%s\n%s", intro, summary);


    double investment, interest = 0;
    int duration = 0;

    //@TODO: make these values dynamic
    investment = interest = 0;
    duration = 0;

    //double value = futureInvestmentValue(investment, interest, duration);

    //START DEBUGGING INFO:
    String dbg_form = "futureInvestmentValue(10000.00, 0.09/12, 5) returns 1093.80";
    double dbg_inv = 10000;
    double dbg_rate = 9;
    int dbg_dur = 5;
    double dbg_value = futureInvestmentValue(dbg_inv, dbg_rate, dbg_dur);
    System.out.printf("DEBUG:\n\texample was\n\t\t%s\n\tYours is:\n\t\tfutureInvestmentValue(%.2f, %.2f, %d) returns %.2f\nDEBUG(end)\n", dbg_form, dbg_inv, dbg_rate, dbg_dur, dbg_value);
    //END DEBUGGING INFO
  }

  public static double futureInvestmentValue(
    double investmentAmount, double monthlyInterestRate, int years) {
        // investmentAmount * (1 + ((monthlyInterestRate * 0.01) /12 ) ) ^ (numberOfYears * 12)
        double rate = (0.01 * monthlyInterestRate) / 12;
        System.out.printf("DEBUG: (0.01 * monthlyInterestRate) / 12  is %f\n", rate, monthlyInterestRate);
        double base =  1 + monthlyInterestRate;
        int exp = years * 12;
        double tmp = Math.pow(base, (double)exp);
        System.out.printf("DEBUG: Math.pow(%.2f, %d) is %.2f\n", base, exp, tmp);
        return investmentAmount * tmp;
  }
}
