import java.io.*;

public class Multi {
  public static void main(String[] args) {
    PrintStream stdout = System.out;

    int hours[][] = new int[10][10];

    for (int i = 0; i < hours.length; i++) {
      for (int j = 0; j < hours[i].length; j++) {
        hours[i][j] = i * j;
      }
    }

    for (int i = 0; i < hours.length; i++) {
      for (int j = 0; j < hours[i].length; j++) {
        stdout.printf("%d\t", hours[i][j]);
      }
      stdout.println();
    }


  }
}
