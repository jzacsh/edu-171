import java.util.Scanner;

public class loan {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.printf("\nI'm a loan calculator.\nI'll tell you the Monthly Payments at various interest rates, given a loan aount and loan duration.\n");
    int dura = 0; // years
    float loan = 0, rate = 0;

    //debugging:
    int jz;
    for (String st : args) {
    }
    
    //get variable information
    if (args.length == 4) {
      //command-line params
      int i;
      for (i=0; i < args.length; i++) {
        if (args[i].contentEquals("-l")) {
          try {
            loan = Float.valueOf(args[++i]);
          }
          catch(Exception e) {
            System.err.printf("ERROR: Value for 'loan' is not a valid number.\n\t%s\n", e);
            loan = 0;
            break;
          }
        }
        else if (args[i].contentEquals("-r")) {
          try{
            dura = Integer.valueOf(args[++i]);
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

    //print table
    String head_title  = "-- loan summary: --------------------------------------------------";
    String head_border = "-------------------------------------------------------------------";

    System.out.printf("\n%s\n", head_border);
    System.out.printf("%s\n",   head_title);
    System.out.printf("Loan Amount    : %-64f\n", loan);
    System.out.printf("Number of Years: %-64x\n", dura);

    System.out.printf("%s\n", head_border);

    String head_rate    = "(%) Interest Rate";
    String head_monthly = "($) Monthly Payment";
    String head_total   = "($) Total Payment";
    System.out.printf("%-25s", head_monthly);
    System.out.printf("%-23s", head_rate);
    System.out.printf("%-18s\n", head_total);

    //looped data calc and output
      //why the f*ck can't i figure out simple interest rate based on their
      //table? is it 5%/yr???
    rate = 5;
    float yearly  = (rate * (float)(.01)) * (loan);
    float monthly = (yearly / 12);
    while (rate <= 8) {
      System.out.printf("%-64f", rate);
      rate = rate + (float)(0.125);

      System.out.printf("%-64f", monthly);
      yearly  = (loan / dur);
      System.out.printf("%-64f", yearly);
      monthly = (yearly / 12);
    }

    System.out.printf("%s\n", head_border);
  }
}
