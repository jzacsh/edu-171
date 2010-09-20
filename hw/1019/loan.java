import java.util.Scanner;

public class loan {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.printf("I'm a loan calculator.\nI'll tell you the Monthly Payments at various interest rates, given a loan aount and loan duration.\n");
    int dura = 0; // years
    float loan = 0, rate = 0;

    //debugging:
    System.out.printf("\nDEBUG:\tNumber of args: %x\n", args.length);
    int jz;
    for (String st : args) {
      System.out.printf("\nDEBUG:\targ is %s\n", st);
//      System.out.printf("\nDEBUG:\targ #%x: %s\n", jz, args[jz]);
    }
    
    //get variable information
    if (args.length == 4) {
      //command-line params
      int i;
      for (i=0; i < args.length; i++) {
        if (args[i] == "-l") {
          try {
            System.err.printf("DEBUG (in loop): args[%x+1] = %s\n", i, args[i+1]);
            loan = Float.valueOf(args[i+1]);
          }
          catch(Exception e) {
            System.err.printf("ERROR: Value for 'loan' is not a valid number.\n\t%s\n", e);
            loan = 0;
            break;
          }
        }
        else if (args[i] == "-r") {
          try{
            System.err.printf("DEBUG (in loop): args[%x+1] = %s\n", i, args[i+1]);
            dura = Integer.valueOf(args[i+1]);
          }
          catch(Exception e) {
            System.err.printf("ERROR: Value for 'duration' is not a valid number.\n\t%s\n", e);
            dura = 0;
            break;
          }
        }
      }
      if (dura == 0 || loan == 0) {
        String usage = "usage:\t -l [loan] -r [rate]\n\tinvoked without parameters, will default to interactive mode.";
        System.err.printf("\nERROR: Necessary values not set.\n%s\n", usage);
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
        System.err.printf("ERROR: Value for 'loan' is not a valid number.\n\t%s\n", e);
        loan = 0;
      }

      if (loan == 0) {
        System.out.printf("Please input the interest rate: %%");
          try {
            dura  = stdin.nextInt();
          }
          catch (Exception e) {
            System.err.printf("ERROR: Value for 'duration' is not a valid number.\n\t%s\n", e);
            dura = 0;
          }
      }

      if (dura == 0 || loan ==0) {
        String usage = "usage:\t -l [loan] -r [rate]\n\tinvoked without parameters, will default to interactive mode.";
        System.err.printf("\nERROR: Necessary values not set.\n%s\n", usage);
        System.exit(1);
      }
    }

    //calculate payments
/*
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
*/
 
    //print table
    String head_title  = "-- loan summary: ----------------------------------------------";
    System.out.printf("%s\n", head_title);
    System.out.printf("Loan Amount: %64f\n", loan);
    System.out.printf("Number of Years: %64i\n", rate);
    String head_border = "---------------------------------------------------------------";
    System.out.printf("%s\n", head_border);
    String head_rate    = "(%) Interest Rate";
    String head_monthly = "($) Monthly Payment";
    String head_total   = "($) Total Payment";
    System.out.printf("%25s", head_monthly);
    System.out.printf("%23s", head_rate);
    System.out.printf("%18s\n", head_total);
  }
}
