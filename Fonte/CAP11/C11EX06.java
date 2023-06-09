import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;

public class C11EX06 extends JFrame {

  JTextField TEXT1;
  JTextField TEXT2;
  JTextField TEXT3;

  JLabel ROTUL1;
  JLabel ROTUL2;
  JLabel ROTUL3;

  public C11EX06() {

    super("Ficha Biométrica");

    Container CONT = getContentPane();

    JLabel ROTUL4 = new JLabel("Nome:");
    JLabel ROTUL5 = new JLabel("Idade:");
    JLabel ROTUL6 = new JLabel("Altura:");

    TEXT1 = new JTextField();
    TEXT2 = new JTextField();
    TEXT3 = new JTextField();

    TEXT1.setDocument(new AceitaVlrLetra());
    TEXT2.setDocument(new AceitaVlrNumInt());
    TEXT3.setDocument(new AceitaVlrNumFloat());

    JButton BOTAO = new JButton("OK");

    JLabel ROTUL7 = new JLabel("Nome:");
    JLabel ROTUL8 = new JLabel("Idade:");
    JLabel ROTUL9 = new JLabel("Altura:");

    ROTUL1 = new JLabel();
    ROTUL2 = new JLabel();
    ROTUL3 = new JLabel();

    setLayout(null);
 
    CONT.add(ROTUL4);
    CONT.add(ROTUL5);
    CONT.add(ROTUL6);

    CONT.add(TEXT1);
    CONT.add(TEXT2);
    CONT.add(TEXT3);

    CONT.add(BOTAO);

    CONT.add(ROTUL7);
    CONT.add(ROTUL8);
    CONT.add(ROTUL9);

    CONT.add(ROTUL1);
    CONT.add(ROTUL2);
    CONT.add(ROTUL3);

    ROTUL4.reshape(30,20,150,20);
    ROTUL5.reshape(30,50,150,20);
    ROTUL6.reshape(30,80,150,20);

    TEXT1.reshape(80,20,150,20);
    TEXT2.reshape(80,50,150,20);
    TEXT3.reshape(80,80,150,20);

    BOTAO.reshape(95,110,70,20);

    ROTUL7.reshape(30,140,150,20);
    ROTUL8.reshape(30,170,150,20);
    ROTUL9.reshape(30,200,150,20);

    ROTUL1.reshape(80,140,150,20);
    ROTUL2.reshape(80,170,150,20);
    ROTUL3.reshape(80,200,150,20);

    AcionaBotao EVENTO = new AcionaBotao();
    BOTAO.addActionListener(EVENTO);

    setSize(273, 273);
    setVisible(true);

  }
 
  public class AceitaVlrLetra extends PlainDocument {
    public void insertString(int VLR, String TXT, AttributeSet ATRIB) 
    throws BadLocationException {

      char CARACTERE;
      byte NUMERO = 1, I = 0;
      for (I = 0; I < TXT.length(); I++) {
        CARACTERE = TXT.charAt(I);
        if (!Character.isLetter(CARACTERE)) 
          NUMERO = 0;
      }
      if(NUMERO != 0)
        super.insertString(VLR, TXT, ATRIB);

    } 
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

  public class AceitaVlrNumFloat extends PlainDocument {
    public void insertString(int VLR, String TXT, AttributeSet ATRIB) 
    throws BadLocationException {

      char CARACTERE;
      byte NUMERO = 1, I = 0;
      for (I = 0; I < TXT.length(); I++) {
        CARACTERE = TXT.charAt(I);
        if (!Character.isDigit(CARACTERE) & CARACTERE != '.') 
          NUMERO = 0;
      }
      if(NUMERO != 0)
        super.insertString(VLR, TXT, ATRIB);

    } 
  }

  private class AcionaBotao implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      String NOME   = TEXT1.getText();
      String IDADE  = TEXT2.getText() + " anos";
      String ALTURA = TEXT3.getText();

      ROTUL1.setText(NOME);
      ROTUL2.setText(IDADE);
      ROTUL3.setText(ALTURA);

    }
  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C11EX06 VISUAL = new C11EX06();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
      }
    );
  }

}
