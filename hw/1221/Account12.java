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
    Date now = new Date();
    this(0, 0, 0, now);
  }

  //constructor
  public Account12(int acctId, double acctBal, double acctRate, Date acctDate) {
    id = acctId;
    balance = acctBal;
    annualInterestRate = acctRate;
    dateCreated = acctDate;
  }


  //accessors:

  public int getId() {
    return id;
  }

  public double getBalance() {
    return balance;
  }

  public double getRate() {
    return annualInterestRate;
  }

  public Date getCreationDate() {
    return dateCreated;
  }

  public double getMonthlyInterestRate() {
    return annualInterestRate / 12;
  }


  //mutators:

  public void setId(int acctId) {
    id = acctId;
  }

  public void setBalance(double acctBal) {
    balance = acctBal;
  }

  public void setRate(double acctRate) {
    annualInterestRate = acctRate;
  }

  //basic methods:

  public double withDraw(double amt) {
    balance -= amt;
    return balance;
  }

  public double deposit(double amt) {
    balance += amt;
    return balance;
  }

  public static void main(String[] args) {
    //printed documentation
    String intro  = "Jonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
           intro += "pg 256; que. #7.3; due: 12/21  (lab# 12)\n";
    String summary = "This is a very basic class for managing a bank account.\n";
    System.out.printf("\n%s\n%s", intro, summary);
  }
}

