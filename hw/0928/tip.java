import java.util.Scanner;

/**
 * Interactive class to prompt user for gratuity and bill sub-total in order to
 * calcuate (and return) a new grand-total and amount of the tip.
 * - course:     COMP-171-801RL
 * - assignment: pg 63; que. #2.5; due: 09/28
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @return string
 *  returns string containing tip and bill-total
 */

public class tip {
  public static void main(String[] args) {
    double total = 0, tip = 0, grat = 0.15;
    Scanner input = new Scanner(System.in);

    //explain program purpose
    String assign = "\nby: Jonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\nAssignment: pg 63; que. #2.5; due: 09/28.\n";
    String intro  = "\nHello, I calculate a tip and bill-total based on\nyour bill's sub-total and your chosen gratuity.\n";
    System.out.printf("%s\n%s\n", assign, intro);

    //retrieve data
    System.out.printf("Please input a bill total:            : $");
    total = input.nextDouble();
    System.out.printf("Please input a gratuity: (eg.: '0.15'):  ");
    grat = input.nextDouble();

    //algorithm
    tip   = grat * total;
    total = tip + total;

    //show user output
    System.out.printf("\nYour Tip is:   $%.2f\nYour Total is: $%.2f\n", tip, total);
  }
}
