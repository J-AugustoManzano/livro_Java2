import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class C12EX09 extends JFrame {

  JTextField TEXT1;

  JCheckBox ARC; // AR Condicionado
  JCheckBox ARQ; // AR Quente
  JCheckBox DIR; // DIRecao Hidraulica
  JCheckBox PME; // Pintura MEtalica
  JCheckBox KEL; // Kit ELetrico
  JCheckBox CAM; // CAMbio Automatico

  long TOTAL =   0; // Valores em dolares
  long VARC = 1599;
  long VARQ =  523;
  long VDIR = 1950;
  long VPME =  652;
  long VKEL =  155;
  long VCAM = 1325;

  public C12EX09() {

    super("Concessionária Multi Marcas");
    Container CONT = getContentPane();
    JLabel ROTUL1 = new JLabel("Selecione os acessórios");
    TEXT1 = new JTextField();

    TEXT1.setHorizontalAlignment(JTextField.CENTER);

    ARC = new JCheckBox("Ar Condicionado");
    ARQ = new JCheckBox("Ar Quente");
    DIR = new JCheckBox("Direção Hidráulica");
    PME = new JCheckBox("Pintura Metálica");
    KEL = new JCheckBox("Kit Elétrico");
    CAM = new JCheckBox("Câmbio Automático");

    ARC.setSelected(false);
    ARQ.setSelected(false);
    DIR.setSelected(false);
    PME.setSelected(false);
    KEL.setSelected(false);
    CAM.setSelected(false);

    setLayout(null);
 
    CONT.add(ROTUL1);

    CONT.add(ARC);
    CONT.add(ARQ);
    CONT.add(DIR);
    CONT.add(PME);
    CONT.add(KEL);
    CONT.add(CAM);

    CONT.add(TEXT1);

    ROTUL1.reshape(30,20,180,20);

    ARC.reshape(30,60,140,20);
    ARQ.reshape(30,90,140,20);
    DIR.reshape(30,120,140,20);
    PME.reshape(30,150,140,20);
    KEL.reshape(30,180,140,20);
    CAM.reshape(30,210,140,20);

    TEXT1.reshape(50,255,190,20);

    ARC.addActionListener(new OPCAO1());
    ARQ.addActionListener(new OPCAO2());
    DIR.addActionListener(new OPCAO3());
    PME.addActionListener(new OPCAO4());
    KEL.addActionListener(new OPCAO5());
    CAM.addActionListener(new OPCAO6());

    TEXT1.setText(String.valueOf(TOTAL));

    setSize(290, 330);
    setVisible(true);

  }

  private class OPCAO1 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      String TEXTO = "Ar Condicionado é incompatível com Ar Quente";

      TOTAL = Long.valueOf(TEXT1.getText()).longValue();

      if (ARC.isSelected() & ARQ.isSelected()) {
        ARQ.setSelected(false);
        JOptionPane.showMessageDialog(null, TEXTO, "Erro", 1);
        TOTAL -= VARQ;
      }

      if (ARC.isSelected())
        TOTAL += VARC;
      else
        TOTAL -= VARC;

      TEXT1.setText(String.valueOf(TOTAL)); 
    
    }
  }

  private class OPCAO2 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      String TEXTO = "Ar Quente é incompatível com Ar Condicionado";

      TOTAL = Long.valueOf(TEXT1.getText()).longValue();

      if (ARC.isSelected() & ARQ.isSelected()) {
        ARC.setSelected(false);
        JOptionPane.showMessageDialog(null, TEXTO, "Erro", 1);
        TOTAL -= VARC;
      }

      if (ARQ.isSelected())
        TOTAL += VARQ;
      else
        TOTAL -= VARQ;

      TEXT1.setText(String.valueOf(TOTAL)); 

    }
  }

  private class OPCAO3 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      TOTAL = Long.valueOf(TEXT1.getText()).longValue();

      if (DIR.isSelected())
        TOTAL += VDIR;
      else
        TOTAL -= VDIR;

      TEXT1.setText(String.valueOf(TOTAL)); 

    }
  }

  private class OPCAO4 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      TOTAL = Long.valueOf(TEXT1.getText()).longValue();

      if (PME.isSelected())
        TOTAL += VPME;
      else
        TOTAL -= VPME;

      TEXT1.setText(String.valueOf(TOTAL)); 

    }
  }

  private class OPCAO5 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      TOTAL = Long.valueOf(TEXT1.getText()).longValue();

      if (KEL.isSelected())
        TOTAL += VKEL;
      else
        TOTAL -= VKEL;

      TEXT1.setText(String.valueOf(TOTAL)); 

    }
  }

  private class OPCAO6 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      TOTAL = Long.valueOf(TEXT1.getText()).longValue();

      if (CAM.isSelected())
        TOTAL += VCAM;
      else
        TOTAL -= VCAM;

      TEXT1.setText(String.valueOf(TOTAL)); 

    }
  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          JDialog.setDefaultLookAndFeelDecorated(true);
          C12EX09 VISUAL = new C12EX09();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      }
    );
  }	
}
