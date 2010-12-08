import java.util.Scanner;
import java.util.Date;
import java.io.*;

/**
 * Very basic class for managing a bank account.
 *
 * - course:     COMP-171-801RL
 * - assignment: pg 256; que. #7.3; due: 12/21  (lab# 12)
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 */
public class Account12 {
  int id;
  double balance;
  double annualInterestRate;
  Date dateCreated;

  //default constructor
  /**
   * Implicitly creates an account object zero-values where possible.
   */
  public Account12() {
    this(0, 0, 0);
  }

  //constructor
  /**
   * Explicitly creates an account object.
   *
   * @param  int     account id
   * @param  double  account balance
   * @param  double  annual interest rate in percent format (5% is 5 not .05)
   */
  public Account12(int acctId, double acctBal, double acctRate) {
    //
    //
    // this();
    // for each:
    //   if not null, use mutator.
    //
    id = acctId;
    balance = acctBal;
    annualInterestRate = acctRate;
    dateCreated = new Date();
  }


  //accessors:
  /**
   * Get the current account id
   * 
   * @return  int  account id.
   */
  public int getId() {
    return id;
  }

  /**
   * Get the current account balance.
   * 
   * @return  double  account balance.
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Get the current interest rate.
   *
   * @return  double  interest rate.
   */
  public double getRate() {
    return annualInterestRate;
  }

  /**
   * Get the account's creation date.
   *
   * @return  Date  account creation date.
   */
  public Date getCreationDate() {
    return dateCreated;
  }

  /**
   * Calculate the current monthly interest rate.
   *
   * @return  double  monthly interest rate, based on current Annual rate.
   */
  public double getMonthlyInterestRate() {
    return annualInterestRate / 12;
  }


  //mutators:

  /**
   * Set the current account id to an arbitrary number.
   *
   * @param  int  new account id.
   */
  public void setId(int acctId) {
    id = acctId;
  }

  /**
   * Set the current balance to an arbitrary amount.
   *
   * @param  double  new account balance.
   */
  public void setBalance(double acctBal) {
    balance = acctBal;
  }

  /**
   * Set the current interest rate to an arbitrary amount.
   *
   * @param  double  new rate of interest
   */
  public void setRate(double acctRate) {
    annualInterestRate = acctRate;
  }

  //basic methods:

  /**
   * Wrapper to deposit(), emulating a withdraw.
   *
   * @param   double  positive value representing amount withdrawn
   * @return  double  current, resulting balance
   */
  public double withDraw(double amt) {
    return deposit(-1 * amt);
  }

  /**
   * Increment value in balance property of current object.
   *
   * @param   double  positive value representing amount withdrawn
   * @return  double  current, resulting balance
   */
  public double deposit(double amt) {
    balance += amt;
    return balance;
  }

  /**
   * Main class's function, run when class is called directly. Serves as proof
   * of concept run; instantiates an example object with test data.
   *
   * @param  String  ignored arguments.
   */
  public static void main(String[] args) {
    //printed documentation
    String intro  = "Jonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
           intro += "pg 256; que. #7.3; due: 12/21  (lab# 12)\n";
    String summary = "This is a very basic class for managing a bank account.\n";
    System.out.printf("\n%s\n%s", intro, summary);

    ///////////////////////////////////////////////

    // proof of concept object for Account12 class.

    //dummy data to be used:
    int acctId = 93024;
    double acctBal = 380.32;
    double acctRate = 5;

    //introduction:
    System.out.printf("Below is a proof of concept run of new object\n");
    System.out.printf("using Account12 class.\tCurrent time is:\n\t%s\n", new Date());

    //basis data
    System.out.printf("::creating object with the following test data:\n");
    System.out.printf("    ::account id:\t%d\n", acctId);
    System.out.printf("    ::account balance:\t$%.2f\n", acctBal);
    System.out.printf("    ::annual interest rate:\t%.0f%%\n", acctRate);

    //create test object
    Account12 acct = new Account12(acctId, acctBal, acctRate);

    //proof of accessor methods
    System.out.printf("\n::Running test of accessor functions:\n");
    System.out.printf("    :: account id:\t%d\n", acct.getId());
    System.out.printf("    :: account balance:\t$%.2f\n", acct.getBalance());
    System.out.printf("    :: annual interest rate:\t%.0f%%\n", acct.getRate());
    System.out.printf("    :: monthly interest rate:\t%.4f%%\n", acct.getMonthlyInterestRate());
    System.out.printf("    :: account creation date:\t%s\n", acct.getCreationDate());

    //new dummy data for mutations
    acctId = 435232;
    acctBal = 498.92;
    acctRate = 3;

    //proof of mutator methods
    System.out.printf("\n::Running test of mutator functions and immediately calling accesors:\n");
    System.out.printf("    :: setting account id to:\t%d\n", acctId);
    acct.setId(acctId);
    System.out.printf("      :: new account id:\t%d\n", acct.getId());
    //
    System.out.printf("    :: setting account balance to:\t$%.2f\n", acctBal);
    acct.setBalance(acctBal);
    System.out.printf("      :: new account balance:\t$%.2f\n", acct.getBalance());
    //
    System.out.printf("    :: setting annual interest rate to:\t%.0f%%\n", acctRate);
    acct.setRate(acctRate);
    System.out.printf("      :: new annual interest rate:\t%.0f%%\n", acct.getRate());
    System.out.printf("      :: new monthly interest rate:\t%.4f%%\n", acct.getMonthlyInterestRate());
  }
}

