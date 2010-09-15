import java.util.Scanner;
import java.util.Calendar;

public class dim {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.printf("I'm a smart calendar, I tell you the days in the month you've specifiedi\n. You *should* use `/usr/bin/cal`... but whatever.\n");
    int month = 0, year = 0, days = 0;
    Calendar current = Calendar.getInstance();

    if (args.length != 0) {
      //@TODO: use date functions, use current date's data
      month = Calendar.get(Calendar.MONTH); // is this how its called?
/*
      month = Calendar.get(MONTH);
      year  = Calendar.get(YEAR);
*/
    }
    else {
      System.out.printf("Please input the month  (format MM): ");
      month = stdin.nextInt();
      System.out.printf("Please input the year (format YYYY): ");
      year  = stdin.nextInt();
    }

    //calculate days:
    System.out.println("\nDEBUG (month + year): " + month + ' ' + year + "\n");
 
    //convert month to string:
    //month = ;

    //print days:
    //System.out.printf("\nDays in month %s: %i \n", month, days);
  }
}
