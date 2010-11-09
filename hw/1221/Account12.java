import java.util.Scanner;
import java.lang.Math;
import java.io.*;

/**
 * - course:     COMP-171-801RL
 * - assignment: pg 256; que. #7.3; due: 12/21  (lab# 12)
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 */
public class Account12 {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    //printed documentation
    String intro  = "Jonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
           intro += "pg 256; que. #7.3; due: 12/21  (lab# 12)\n";
    String summary = "\n";
    System.out.printf("\n%s\n%s", intro, summary);

    //account datas:
    int id = 0;                    //account id
    double balance = 0;            //account balance
    double annualInterestRate = 0; //interest rate
//    dateCreated; //account creation date
  }
}

