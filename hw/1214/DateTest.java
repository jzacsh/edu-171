import java.util.Calendar;

/**
 * Prints current date information, as proof of concept for the Calendar class.
 *   test the Date bclass
 * - course:     COMP-171-801RL
 * - assignment: pg 257; que. #7.5; due: 12/14
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 */

public class DateTest {
  public static void main(String[] args) {
    String intro = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "pg 257; que. #7.5; due: 12/14\n";
    String summary = "I'm a class designed to test the calendar utilities provided by Java.";
    System.out.printf("%s\n%s\n", intro, summary);

    int month, year, day;
    Calendar current = Calendar.getInstance();
    month = current.get(Calendar.MONTH);
    year  = current.get(Calendar.YEAR);
    day   = current.get(Calendar.DAY_OF_MONTH) + 1;
    
    System.out.printf("Day:   %d\nMonth: %d\nYear:  %d\n", day, month, year);
  }
}
