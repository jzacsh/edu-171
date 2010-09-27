import java.util.Scanner;

public class darray {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    String intro = "Hello, I am going to double the size of your";
    intro += " array,\nhow large is your array?";

    System.out.printf("%s ", intro);

    int size;
    size = stdin.nextInt();


    int[] orig, doubled;
    orig = new int[size];

    System.out.printf("\nSize of your array will be: %d\n", orig.length);
    doubled = doubleCapacity(orig);
    System.out.printf("Size of your new array is : %d\n", doubled.length);
  }

  public static int[] doubleCapacity(int[] list) {
    int[] bigger;
    bigger = new int[2 * list.length];
    return bigger;
  }
}
