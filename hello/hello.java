import javax.swing.JOptionPane;

public class hello {
    /**
     * @param args
     */
    public static void main(String[] args) {
      String cmdtxt    =  "Hello World!";
      System.out.println(cmdtxt);

      String dialogtxt =  "Hi Java";
      JOptionPane.showMessageDialog(null, dialogtxt);
    }
}
