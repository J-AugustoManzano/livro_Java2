import javax.swing.*;

public class C11EX01 extends JFrame {

  public C11EX01() {

    super("Formulário 1");
    setSize(427, 273);
    setVisible(true);

  }
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C11EX01 VISUAL = new C11EX01();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
        }
      }
    );
  }

}