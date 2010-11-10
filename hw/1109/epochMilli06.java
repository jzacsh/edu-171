import java.util.Scanner;
import java.util.Date;

/**
 * Convert milliseconds to readable colon-delimeted hour, minute, second.
 * - course:     COMP-171-801RL
 * - assignment: pg 167; que. #5.25; due: 11/09  (lab# 06)
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 */
public class epochMilli06 {
  public static String convertMillis(long millis) {
    long seconds = millis / 1000; // rational base of measure
    long time;

    //hours:
    time += seconds / (60 * 60); // 60 seconds, 60 minutes per hour.
    //minutes:
    time += (seconds % (60 * 60)) / 60; // just minutes
    //seconds:
    time += (seconds % (60 * 60)) % 60; //remainder

    return time;
  }

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    //printed documentation
    String intro = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "assignment: pg 167; que. #5.25; due: 11/09  (lab# 06)\n";
    intro += "Converts milliseconds to readable colon-delimeted hour, minute, second.\n";
    intro += "Below is a test run of the method convertMillis(), using the current time.\n";
    System.out.printf("%s", intro);

    //codez
    long m = new Date().getTime();
    System.out.printf("%d milliseconds is %s", m, convertMillis(m));
  }
}
