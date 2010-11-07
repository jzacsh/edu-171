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
    final int  MAX = 300; //highest value for random number generation
    final int  QUANTITY = 100; //number of datas to be passed around
    final char DELIM = ' '; //delimeter to use for seperating datas

    //request user input of file name
    String filename;
    filename = stdin.nextString();
    filename = "./" + filename + ".txt";

    //file objects
    java.io.File fd = new java.io.File(filename); //create file descriptor
    java.io.PrintWriter fwrite = new java.io.PrintWriter(filename); //create file out
    java.io.Scanner fread = new java.io.Scanner(fd); //create file in
    fread.useDelimeter(DELIM);

    //initialize array to hold data from file.
    int[] randoms;
    randoms = new int[QUANTITY];

    //ensure file exists
    if (!fd.isFile()) {
      //file does not exist, create now.
      AppendTxtFile(fwrite);
    }

    //read in data from file, explode into int array randoms
    int i = 0;
    while (fread.hasNext() && i <= QUANT) {
      randoms[i] = fread.nextInt();
      i++;
    }

    //sort the data that's been read in
    SortInts(randoms);

    //print neat table of data in randoms array
  }

  /**
   * Generates [QUANT] random integers which are immediately passed into a file on
   * disk.
   *
   * @param  object  PrintWriter object being used
   * @return int     status code of file composition.
   *  - 0 upon success
   *  - 1 upon failure.
   */
  public static int AppenTxtFile(java.io.File f) {
    int i = 0;
    while (i < 100) {
      int r = (int)(Math.Random() * MAX);
      try (e) {
        f.printf("%d%c", r, DELIM);
      }
      catch {
        f.close();
        return 1;
      }
      i++;
    }
    f.close();

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
