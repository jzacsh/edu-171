import java.util.Scanner;
import java.io.*;

/**
 * From question:
 *   Write the code that test if the file "C:\\test.txt" exists or not.
 */
public class bonusQue43 {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    String intro  = "\nJonathan Zacsh <jzacsh@gmail.com>; COMP-171-801RL\n";
           intro += "Date: 2010-12-14; Exam 03; Bonus que 43;\n";
    System.out.printf("%s\n", intro);

    String explained = "Hello, I test for the existence of a file.";
    String prompter = "Which file would you like to make sure exists?\n [full or relative path]:";
    System.out.printf("%s\n%s ", explained, prompter);
    String fname = stdin.next();

    String does = ", indeed, "; // to ensure its in scope
    if (!(new File(fname)).exists()) {
      does = " NOT ";
    }

    System.out.printf("The following file does%sexist:\n\t%s\n", does, fname);
  }
}
