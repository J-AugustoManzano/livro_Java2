import javax.swing.*;

public class C12EX03 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JDialog.setDefaultLookAndFeelDecorated(true);

          String SN1, SN2;
          int N1, N2, R;

          SN1 = JOptionPane.showInputDialog("Entre o 1o. valor:");
          SN2 = JOptionPane.showInputDialog("Entre o 2o. valor:");

          N1 = Integer.parseInt(SN1);
          N2 = Integer.parseInt(SN2);

          R = N1 + N2;

          JOptionPane.showMessageDialog(null,
          "Adição = " + R, "Resultado", 1);

          System.exit(0);

        }
      }
    );
  }	

}
