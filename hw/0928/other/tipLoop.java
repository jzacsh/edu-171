import java.util.Scanner;

public class tipLoop {
  public static void main(String[] args) {
    float total = 0, tipamt = 0;
    for (i=0; i <= args.length; i++) {
      if (args.length != 0) {
        total = args(i+1);
      }
      else {
        Scanner input = new java.util.Scanner(System.in);
        System.out.printf("Please input a bill total: ");
        total = input.nextFloat();
      }

      tipamt = (float)0.15 * total;
      total  = tipamt + total;

      System.out.printf("\nYour Tip is:   %s\nYour Total is: %s\n", tipamt, total);
    }
  }
}
