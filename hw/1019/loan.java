import java.util.Scanner;

public class loan {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.printf("I'm a loan calculator.\nI'll tell you the Monthly Payments at various interest rates, given a loan aount and loan duration.\n");
    int dura = 0; // years
    float loan = 0, rate = 0;
    
    if (args.length == 4) {
      for (i in args[]) {
        if (args[i] == '-l') {
          loan = args[i+1];
        }
        else if (args[i] == '-r') {
          dura = args[i+1];
        }
      }
      if (dura == 0 || loan == 0) {
        usage();
        die();
      }
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
