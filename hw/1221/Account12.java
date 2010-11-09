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
    anualInterestRate = 0;
    Date dateCreated = new Date();
  }

  //constructor
  public Account12(int acctId, double acctBal, double acctRate, Date acctDate) {
    id = acctId;
    balance = acctBal;
    anualInterestRate = acctRate;
    dateCreated = acctDate;
  }


  //accessors:

  public getId() {
    //codez
  }

  public getBalance() {
    //codez
  }

  public getRate() {
    //codez
  }


  //mutators:

  public setId() {
    //codez

  public setBalance() {
    //codez

  public setRate() {
    //codez
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

