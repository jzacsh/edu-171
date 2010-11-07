import java.util.Scanner;
import java.util.Calendar;

/**
 * Calculates number of days in a given month for a given year, taking into
 * account leap year.
 *   test the Date bclass
 * - course:     COMP-171-801RL
 * - assignment: pg 257; que. #7.5; due: 12/14
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 */

public class DateTest {
  public static void main(String[] args) {
    String intro = "\n\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "\npg 257; que. #7.5; due: 12/14\n";
    String summary = "I'm a class designed to test the calendar utilities provided by Java.\n.";
    System.out.printf("%s\n%s", intro, summary);

    int month, year, day;
    Calendar current = Calendar.getInstance();
    month = current.get(Calendar.MONTH);
    year  = current.get(Calendar.YEAR);
    day   = current.get(Calendar.DAY);
    
    printf("Day: %x\nMonth: %x\nYear:%x\n", day, month, year);
  }
}
