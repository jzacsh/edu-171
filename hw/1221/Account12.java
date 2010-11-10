import java.util.Scanner;
import java.util.Date;
import java.lang.Math;
import java.io.*;

/**
 * - course:     COMP-171-801RL
 * - assignment: pg 256; que. #7.3; due: 12/21  (lab# 12)
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 */
public class Account12 {

  //default constructor
  public Account12() {
    id = 0;
    balance = 0;
    annualInterestRate = 0;
    Date dateCreated = new Date();
  }

  //constructor
  public Account12(int acctId, double acctBal, double acctRate, Date acctDate) {
    id = acctId;
    balance = acctBal;
    annualInterestRate = acctRate;
    dateCreated = acctDate;
  }


  //accessors:

  public getId() {
    return id;
  }

  public getBalance() {
    return balance;
  }

  public getRate() {
    return annualInterestRate;
  }

  public getCreationDate() {
    return dateCreated;
  }

  public getMonthlyInterestRate() {
    //codez
  }


  //mutators:

  public setId(int acctId) {
    id = acctId;
  }

  public setBalance(double acctBal) {
    balance = acctBal;
  }

  public setRate(double acctRate) {
    annualInterestRate = acctRate;
  }

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    //printed documentation
    String intro  = "Jonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
           intro += "pg 256; que. #7.3; due: 12/21  (lab# 12)\n";
    String summary = "\n";
    System.out.printf("\n%s\n%s", intro, summary);

    //codez
  }
}

