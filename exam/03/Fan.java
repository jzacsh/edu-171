
/**
 * Bonus Question #41 for Exam 03
 * @author Jonathan Zacsh <jzacsh@gmail.com>
 * @date 2010-12-14
 */
public class Fan {
  //fan speed
  int SLOW   = 1;
  int MEDIUM = 2;
  int FAST   = 3;

  Fan() {
    int speed = SLOW;
    bool on = false;
    String color = "blue";
    double radius = 5.0;
  }

  Fan(int spd, bool stat, String col, double rad) {
    int speed = spd;
    bool on = stat;
    String color = col;
    double radius = rad;
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

  bool getOn() {
    return on;
  }

  voit setOn(bool stat) {
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
    if (this.on) {
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

    Fan f = new Fan(FAST, on, "yellow", 10.0);
    String explained  = "Instantiated new Fan object, using:\n\t";
           explained += "speed FAST, radius 10.0, color 'yellow', status 'off'";
           explained += "Now running its toString() method...";
    System.out.printf("::%s\n%s", explained, f.toString());
  }
}
