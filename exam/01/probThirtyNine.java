public class probThirtyNine {
  public static void main (String args[]) {
    int sum = 0;
    int item = 0;
    do {
      item++;
      sum += item;
      if (sum > 4) break;
    }
    while(item < 5);

    System.out.println("sum is: "+sum);
  }
}
