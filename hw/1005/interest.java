import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Calculates year's interest based on user-provided interest rate and balance.
 *   prints string Total Interest
 * - course:     COMP-171-801RL
 * - assignment: pg 65; que. #2.13; due: 10/05
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @return void
 */
public class interest {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    String intro = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "assignment: pg 65; que. #2.13; due: 10/05\n";
    System.out.printf("%s\nI calculate Annual Interest, given an interest rate and balance.\n", intro);
    float balance = 0, rate = 0, interest = 0;

    System.out.printf("Please input a balance       : $");
    balance = stdin.nextFloat();
    System.out.printf("Please input an interest rate: %%");
    rate    = stdin.nextFloat();

    interest = balance * (rate / 1200);
    if (args.length != 0) {
      JOptionPane.showMessageDialog(null, "\nYour Interest is: $" + interest + "\n");
    }
    else {
      System.out.printf("\nYour Interest is: $%.2f \n", interest);
    }
  }
}
