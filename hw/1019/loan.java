import java.util.Scanner;

public class loan {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.printf("I'm a loan calculator.\nI'll tell you the Monthly Payments at various interest rates, given a loan aount and loan duration.\n");
    int dura = 0; // years
    float loan = 0, rate = 0;
    
    if (args.length == 4) {
      //command-line params
      for (i in args[]) {
        if (args[i] == '-l') {
          try {
            loan = args[i+1];
          }
          catch(Exception e) {
            System.err.printf("ERROR: Value for 'loan' is not a valid number.\n\t%s", e);
            loan = 0;
            break;
          }
        }
        else if (args[i] == '-r') {
          try{
            dura = args[i+1];
          }
          catch(Exception e) {
            System.err.printf("ERROR: Value for 'duration' is not a valid number.\n\t%s", e);
            dura = 0;
            break;
          }
        }
      }
      if (dura == 0 || loan == 0) {
        String usage = "usage:\t -l [loan] -r [rate]\n\tinvoked without parameters, will default to interactive mode.";
        System.err.printf("ERROR:\n%s", usage);
        System.exit(1);
      }
    }
    else {
      //interactive mode
      System.out.printf("Please input the loan amount: $");
      try {
        loan = stdin.nextInt();
      }
      catch (Exception e) {
        System.err.printf("ERROR: Value for 'loan' is not a valid number.\n\t%s", e);
        loan = 0;
      }

      if (loan == 0) {
        System.out.printf("Please input the interest rate: %%");
          try {
            dura  = stdin.nextInt();
          }
          catch (Exception e) {
            System.err.printf("ERROR: Value for 'duration' is not a valid number.\n\t%s", e);
            dura = 0;
          }
      }

      if (dura == 0 || loan ==0) {
        String usage = "usage:\t -l [loan] -r [rate]\n\tinvoked without parameters, will default to interactive mode.";
        System.err.printf("ERROR:\n%s", usage);
        System.exit(1);
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
 
    //print table
    printf("-- loan summary: ----------------------------------------------\n");
    printf("Loan Amount: %64f\n", loan);
    printf("Number of Years: %64i\n", rate);
    pinttf("---------------------------------------------------------------\n");
    String head_rate    = "(%) Interest Rate";
    String head_monthly = "($) Monthly Payment";
    String head_total   = "($) Total Payment";
    printf("%25s", head_monthly);
    printf("%23s", head_rate);
    printf("%18s\n", head_total);
  }
}
