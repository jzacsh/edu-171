import java.util.Scanner;
import java.util.Calendar;
import java.io.*;

/**
 * Calculates number of days in a given month for a given year, taking into
 * account leap year.
 *   prints string Description of days in month
 * - course:     COMP-171-801RL
 * - assignment: pg 94; que. #3.11; due: 10/12  (lab# 03)
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @return void
 */

public class dim {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    String intro = "\n\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "\npg 94; que. #3.11; due: 10/12  (lab# 03)\n";
    String summary = "I'm a smart calendar, I tell you the days in the month you've specifiedi\n.";
    summary += "You *should* use `/usr/bin/cal`... but whatever.\n";
    System.out.printf("%s\n%s", intro, summary);
    int month = 0, year = 0, days = 0;
    Calendar current = Calendar.getInstance();
    
    if (args.length != 0) {
      month = current.get(Calendar.MONTH);
      year  = current.get(Calendar.YEAR);
    }
    else {
      System.out.printf("Please input the month  (format MM): ");
      try {
        month = stdin.nextInt() - 1;
      } catch (Exception e) {
        System.err.printf("ERROR: %s\nBetter luck next time.\n", e);
        System.exit(1);
      }
      System.out.printf("Please input the year (format YYYY): ");
      year  = stdin.nextInt();
      if (year < 0 || month < 0) {
        System.out.printf("ERROR: Not a valid date.");
        return;
      }
      else if (month > 11) {
        System.out.printf("ERROR: Not a valid date.");
        return;
      }
    }

    //calculate days:
    if (month == 1) {
      if ((year % 4) == 0 && (year % 100) != 0) {
        days = 29;
      }
      else if ((year % 400) == 0) {
        days = 29;
      }
      else {
        days = 28;
      }
    }
    else if(month == 8 || month == 3 || month == 5 || month == 10) {
        days = 30;
    }
    else {
        days = 31;
    }
 
    System.out.printf("\nDays in month %d: %d \n", month + 1, days);
  }
}
