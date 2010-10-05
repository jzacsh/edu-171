/**
 * Randomly generates 100 random integers between 0 and 9
 * - course:     COMP-171-801RL
 * - assignment: pg 205; que. #6.7; due: 11/16
 *
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @return string table of numbers representing quantity of randomly printed
 * characters.
 */
public class counting {
  public static void main(String[] args) {
    int quant = 100; //number of digits to generate
    int range; //value of numbers generated between upper and lower
    int lower = 0; //upper limit of generation
    int upper = 9; //upper limit of generation
    String intro = "\nJonathan Zacsh <jzacsh@gmail.com>\n";
    intro += "pg 205; que. #6.7; due: 11/16\n";
    String summary = "Then I will calculate the occurances of each number.";
    System.out.printf("\n%s\nBelow I will generate a 'random' number between %d and %d, %d times.\n%s\n", intro, lower, upper, quant, summary);


    //get size of range
    int i;
    range = 0;
    for (i = lower; i <= upper; i++)
      range++;

    double[] counts = new double[range];

    //clearing out values for incrementation
    for (i = lower; i <= upper; i++)
      counts[i] = 0;
    
    //generate:
    java.util.Random gen = new java.util.Random();
    int current, ii;
    for (i = 0; i < quant; i++) {
      current = gen.nextInt(range);
      for (ii = lower; ii <= upper; ii++) {
        if (current == ii)
          counts[ii]++;
      }
    }

    //print table
    String head_title  = "-- occurances of each random number -------------------------------";
    String head_border = "-------------------------------------------------------------------";

    System.out.printf("\n%s\n", head_title);

    //loop through each number, printing the result stored in an array
    for (i = lower; i <= upper; i++) {
      System.out.printf("%-30d", i);
      System.out.printf("%26.0f occurances\n", counts[i]);
    }

    String verify = "java counting | awk '/occurances$/{ sum += $2 } END { print sum }'";
    System.out.printf("\nYou can verify the output of this program by running the following:\n%s\nfalconindy++ awk++\n", verify);
    System.out.printf("%s\n", head_border);
  }
}
