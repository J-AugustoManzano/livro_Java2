import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;

public class C12EX01 extends JFrame {

  JTextField TEXT1;

  public C12EX01() {

    super("Validação Numérica");
    Container CONT = getContentPane();

    JLabel ROTUL1 = new JLabel("Entre um valor numérico inteiro:");
    TEXT1 = new JTextField();
    JButton BOTAO = new JButton("OK");

    TEXT1.setDocument(new AceitaVlrNumInt());

    setLayout(null);
 
    CONT.add(ROTUL1);
    CONT.add(TEXT1);
    CONT.add(BOTAO);

    ROTUL1.reshape(30,30,185,20);
    TEXT1.reshape(225,30,50,20);
    BOTAO.reshape(120,80,70,20);

    AcionaBotao EVENTO = new AcionaBotao();
    BOTAO.addActionListener(EVENTO);

    setSize(310, 160);
    setVisible(true);

  }
 
  public class AceitaVlrNumInt extends PlainDocument {
    public void insertString(int VLR, String TXT, AttributeSet ATRIB) 
    throws BadLocationException {

      char CARACTERE;
      byte NUMERO = 1, I = 0;
      for (I = 0; I < TXT.length(); I++) {
        CARACTERE = TXT.charAt(I);
        if (!Character.isDigit(CARACTERE)) 
          NUMERO = 0;
      }
      if(NUMERO != 0)
        super.insertString(VLR, TXT, ATRIB);

    } 
  }

  private class AcionaBotao implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      int NUMERO;
      String SNUM = TEXT1.getText(), TEXTO;

      NUMERO = Integer.valueOf(SNUM).intValue();

      if (NUMERO >= 20 && NUMERO <= 90) {
        TEXTO = "O valor está entre 20 e 90";
        JOptionPane.showMessageDialog(null, TEXTO); }
      else {
        TEXTO = "O valor não está entre 20 e 90";
        JOptionPane.showMessageDialog(null, TEXTO);
      }
    }

  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          JDialog.setDefaultLookAndFeelDecorated(true);
          C12EX01 VISUAL = new C12EX01();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      }
    );
  }	
}
