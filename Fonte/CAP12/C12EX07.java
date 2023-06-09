import javax.swing.*;

public class C12EX07 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JDialog.setDefaultLookAndFeelDecorated(true);

          Object[] OPCAO = { "Sim", "Não" };
          String SN1, SN2;
          int N1, N2, R, RESP;

          do {

            SN1 = JOptionPane.showInputDialog
                  ("Entre o 1o. valor:");
            if (SN1 == null) 
              N1 = 0;
             else
              N1 = Integer.parseInt(SN1);

            SN2 = JOptionPane.showInputDialog
                  ("Entre o 2o. valor:");
            if (SN2 == null) 
              N2 = 0;
            else
              N2 = Integer.parseInt(SN2);

            R = N1 / N2;

            JOptionPane.showMessageDialog(null,"Divisão = "
            + R, "Resultado", 1);

            RESP = JOptionPane.showOptionDialog(null, 
            "Deseja mais cálculo?", "Resposta", JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE, null, OPCAO, OPCAO[0]); }

          while (RESP == JOptionPane.YES_OPTION);

          System.exit(0);

        }
      }
    );
  }	

}
