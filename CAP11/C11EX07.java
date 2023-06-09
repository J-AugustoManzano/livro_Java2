import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;
import java.text.DecimalFormat;

public class C11EX07 extends JFrame {

  JTextField TEXT1;
  JTextField TEXT2;
  JTextField TEXT3;

  JLabel ROTUL1;
  JLabel ROTUL2;
  JLabel ROTUL3;

  public C11EX07() {

    super("Salário");

    Container CONT = getContentPane();

    JLabel ROTUL4 = new JLabel("Entre horas trabalhadas:");
    JLabel ROTUL5 = new JLabel("Entre valor da hora:");
    JLabel ROTUL6 = new JLabel("Entre percentual de desconto:");

    TEXT1 = new JTextField();
    TEXT2 = new JTextField();
    TEXT3 = new JTextField();

    TEXT1.setDocument(new AceitaVlrNumFloat());
    TEXT2.setDocument(new AceitaVlrNumFloat());
    TEXT3.setDocument(new AceitaVlrNumFloat());

    JButton BOTAO = new JButton("OK");

    JLabel ROTUL7 = new JLabel("Salário Bruto::");
    JLabel ROTUL8 = new JLabel("Desconto:");
    JLabel ROTUL9 = new JLabel("Salário Liquido:");

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

    ROTUL4.reshape(30,20,170,20);
    ROTUL5.reshape(30,50,170,20);
    ROTUL6.reshape(30,80,170,20);

    TEXT1.reshape(217,20,150,20);
    TEXT2.reshape(217,50,150,20);
    TEXT3.reshape(217,80,150,20);

    BOTAO.reshape(30,110,70,20);

    ROTUL7.reshape(30,140,150,20);
    ROTUL8.reshape(30,170,150,20);
    ROTUL9.reshape(30,200,150,20);

    ROTUL1.reshape(217,140,150,20);
    ROTUL2.reshape(217,170,150,20);
    ROTUL3.reshape(217,200,150,20);

    AcionaBotao EVENTO = new AcionaBotao();
    BOTAO.addActionListener(EVENTO);

    setSize(410, 273);
    setVisible(true);

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

      float HT, VH, PD, TD, SB, SL;
      DecimalFormat df = new DecimalFormat("0.00");

      String SHT = TEXT1.getText();
      String SVH = TEXT2.getText();
      String SPD = TEXT3.getText();
     
      HT = Float.valueOf(SHT).floatValue();
      VH = Float.valueOf(SVH).floatValue();
      PD = Float.valueOf(SPD).floatValue();

      SB = HT * VH;
      TD = (PD / 100) * SB;
      SL = SB - TD;

      ROTUL1.setText(String.valueOf(df.format(SB)));
      ROTUL2.setText(String.valueOf(df.format(TD)));
      ROTUL3.setText(String.valueOf(df.format(SL)));

    }

  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          C11EX07 VISUAL = new C11EX07();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      }
    );
  }	

}
