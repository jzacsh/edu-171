import java.util.Scanner;
import javax.swing.JOptionPane;

public class interest {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.printf("I calculate Annual Interest, given an interest rate and balance.\n");
    float balance = 0, rate = 0, interest = 0;

    System.out.printf("Please input a balance       : ");
    balance = stdin.nextFloat();
    System.out.printf("Please input an interest rate: ");
    rate    = stdin.nextFloat();

    interest = balance * (rate / 1200);
    if (args.length != 0) {
      JOptionPane.showMessageDialog(null, "\nYour Interest is: " + interest + "\n");
    }
    else {
      System.out.printf("\nYour Interest is:%.2f \n", interest);
    }
  }
}
