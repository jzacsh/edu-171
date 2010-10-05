import java.util.Scanner;

/**
 * Class to demonstrates the ability of the doubleCapacity function to return
 * an array of double the size it was given.
 * prints a string 
 *   description of newly created array, as proof of functioning algorithm.
 * - course:     COMP-171-801RL
 * - assignment: pg 205; que. #6.13; due: 11/23
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @return void
 */

public class darray {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    String stamping = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    stamping += "pg 205; que. #6.13; due: 11/23\n";
    String intro = "Hello, I am going to double the size of your";
    intro += " array,\nhow large is your array?";

    System.out.printf("\n%s\n%s ", stamping, intro);

    int size;
    size = stdin.nextInt();


    int[] orig, doubled;
    orig = new int[size];

    System.out.printf("\nSize of your array will be: %d\n", orig.length);
    doubled = doubleCapacity(orig);
    System.out.printf("Size of your new array is : %d\n", doubled.length);
  }

  /**
   * Doubles the size of any given array.
   *
   * @param  array an array of integers of any given size.
   * @return array an array of integers, double the size of its input.
   */
  public static int[] doubleCapacity(int[] list) {
    int[] bigger;
    bigger = new int[2 * list.length];
    return bigger;
  }
}
