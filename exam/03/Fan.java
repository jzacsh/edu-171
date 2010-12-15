
/**
 * Bonus Question #41 for Exam 03
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @date 2010-12-14
 */
public class Fan {
  //fan speed
  public static final int SLOW   = 1;
  public static final int MEDIUM = 2;
  public static final int FAST   = 3;

  //class properties
  protected int speed;
  protected boolean on;
  protected String color;
  protected double radius;

  Fan() {
    speed = SLOW;
    on = false;
    color = "blue";
    radius = 5.0;
  }

  Fan(int spd, boolean stat, String col, double rad) {
    speed = spd;
    on = stat;
    color = col;
    radius = rad;
  }

  /**
   * Accessors and Mutators
   */
  int getSpd() {
    return speed;
  }

  void setSpd(int spd) {
    speed = spd;
  }

  boolean getOn() {
    return on;
  }

  void setOn(boolean stat) {
    on = stat;
  }

  String getColor() {
    return color;
  }

  void setColor(String col) {
    color = col;
  }

  double getRadius() {
    return radius;
  }

  void setRadius(double rad) {
    radius = rad;
  }

  public String toString() {
    String msg = "Fan Object:\n";

    //check status
    if (on) {
      msg += " speed  : " + speed  + "\n";
    }
    else {
      msg += " status : fan is off\n";
    }
    msg += " color  : " + color  + "\n";
    msg += " radius : " + radius + "\n";

    return msg;
  }

  public static void main(String[] args) {
    String intro  = "Jonathan Zacsh <jzacsh@gmail.com>; Exam 03; Date 2010-12-14\n";
           intro += "This is a proof of concept class to show off the accessors\n";
           intro += "and methods of a 'Fan' object.\n";
    System.out.printf("%s\n", intro);

    Fan f = new Fan(FAST, true, "yellow", 10.0);
    String explained  = "::Instantiated new Fan object, using:\n\t";
           explained += "speed FAST, radius 10.0, color 'yellow', status 'off'\n";
           explained += "::Now running its toString() method...\n";
    System.out.printf("%s\n%s", explained, f.toString());
  }
}
