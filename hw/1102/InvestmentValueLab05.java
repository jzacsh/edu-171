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

public class InvestmentValueLab05 {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    // start professor requisite //////////////////////////////////////////////////////////////////
    String intro = "\n\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "\npg 163; que. #5.7; due: 11/02\n";
    // end professor requisite ////////////////////////////////////////////////////////////////////
    String summary = "I'm an investment calculator. All I need is the interest rate and duration (in years).\n";
    System.out.printf("%s\n%s", intro, summary);
  }
}
