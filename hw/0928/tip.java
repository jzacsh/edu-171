import java.util.Scanner;

public class tip {
  public static void main(String[] args) {
    double total = 0, tip = 0;
    Scanner input = new Scanner(System.in);

    System.out.printf("Please input a bill total: $");
    total = input.nextDouble();

    tip   = 0.15 * total;
    total = tip + total;

    System.out.printf("\nYour Tip is:   $%.2f\nYour Total is: $%.2f\n", tip, total);
  }
}
