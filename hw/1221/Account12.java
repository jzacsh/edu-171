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
  public Account12() {
    this(0, 0, 0, new Date());
  }

  //constructor
  public Account12(int acctId, double acctBal, double acctRate, Date acctDate) {
    id = acctId;
    balance = acctBal;
    annualInterestRate = acctRate;
    dateCreated = acctDate;
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

    // proof of concept object for Account12 class.
  }
}

