import javax.swing.*;
import java.awt.*;

public class C11EX02 extends JFrame {

  public C11EX02() {

    super("Formulário 2");
 
    Container CONT = getContentPane();
    CONT.setBackground(Color.yellow);

    setSize(427, 273);
    setVisible(true);

  }
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C11EX02 VISUAL = new C11EX02();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
        }
      }
    );
  }

}