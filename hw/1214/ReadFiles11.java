import java.io.*;
import java.util.Scanner;

/**
 * Proof of reading/writing data, along with some unrelated busy-work tasks
 * (like sorting numbers). Tazks will be seperated into methods as necesary.
 *   Writing/Reading data
 * - course:     COMP-171-801RL
 * - assignment: pg 300; que. #8.22; due: 12/14
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 */
public class ReadFiles11 {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    //printed documentation
    String intro = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
    intro += "pg 300; que. #8.22; due: 12/14\n";
    String summary  = "Write a program to create a file named Exercise8_22.txt if it does not exist\n";
           summary += "write one hundred integers created randomly into the file using text I/O.\n";
           summary += "Integers are separated by spaces in the file,. Read the data back from the\n";
           summary += "file and display the sorted data.\n";
    System.out.printf("%s\n%s\n", intro, summary);

    //set constants
    final int  QUANTITY = 100; //number of datas to be passed around
    final char DELIM = ' '; //delimeter to use for seperating datas

    //request user input of file name
    String filename;
    filename = stdin.nextString();
    java.io.File file = new java.io.File("./" + filename + ".txt");

    //ensure data is available
    if (!file.isFile()) {
      //file does not exist, create now.
      AppendTxtFile(file);
    }

    //initialize array to hold data from file.
    int[] randoms = 0;
    randoms = new int[QUANTITY];

    //read in data from file, explode into int array randoms

    //sort the data that's been read in
    SortInts();

    //print neat table of data in randoms array
  }

  /**
   * Generates [QUANT] random integers which are immediately passed into a file on
   * disk.
   *
   * @param  object  File object being used
   * @return int     status code of file creation. 0 upon success.
   */
  public static int AppenTxtFile(java.io.File f) {
    //generate [QUANTITY], [DELIM] seperated, ints into fname.txt
    return 0;
  }

  /**
   * Sorts an array of integers in ascending order.
   *
   * @param  int    an array of integers to be sorted in memory.
   * @return void
   */
  public static void SortInts(int[] nums) {
    //return a sorted
  }
}
