import java.util.Scanner;

public class tip {
  public static void main(String[] args) {
    float total = 0, tip = 0;
    Scanner input = new Scanner(System.in);

    System.out.printf("Please input a bill total:\n");
    total = input.nextFloat();

    tip   = (float)0.15 * total;
    total = tip + total;

    System.out.printf("\nYour Tip is:   %s\nYour Total is: %s\n", tip, total);

//    JOptionPane.showMessageDialog(null, txt);
  }
}
