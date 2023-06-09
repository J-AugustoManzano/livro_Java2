import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class C12EX08 extends JFrame {

  JTextField TEXT1;
  JRadioButton RADIO1 = new JRadioButton("Masculino",true);
  JRadioButton RADIO2 = new JRadioButton("Feminino");

  public C12EX08() {

    super("Atendimento");

    Container CONT = getContentPane();
    ButtonGroup GRUPO = new ButtonGroup();

    JLabel ROTUL1 = new JLabel("Entre seu nome:");
    JLabel ROTUL2 = new JLabel("Selecione seu sexo:");
    TEXT1 = new JTextField();
    JButton BOTAO = new JButton("OK");

    setLayout(null);
 
    GRUPO.add(RADIO1);
    GRUPO.add(RADIO2);

    CONT.add(ROTUL1);
    CONT.add(TEXT1);
    CONT.add(ROTUL2);
    CONT.add(RADIO1);
    CONT.add(RADIO2);
    CONT.add(BOTAO);

    ROTUL1.reshape(30,30,110,20);
    TEXT1.reshape(160,30,100,20);

    ROTUL2.reshape(30,60,130,20);
    RADIO1.reshape(160,60,100,20);
    RADIO2.reshape(160,80,100,20);

    BOTAO.reshape(120,120,70,20);

    AcionaBotao EVENTO = new AcionaBotao();
    BOTAO.addActionListener(EVENTO);

    setSize(310, 200);
    setVisible(true);

  }

  private class AcionaBotao implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      String TEXTO;

      if (RADIO1.isSelected() == true) { 
        TEXTO = "Olá, Senhor \n" + TEXT1.getText();
        JOptionPane.showMessageDialog(
          null, TEXTO, "Saudação para homem", 1
        );
      }

      if (RADIO2.isSelected() == true) {
        TEXTO = "Olá, Senhora \n" + TEXT1.getText();
        JOptionPane.showMessageDialog(
          null, TEXTO, "Saudação para mulher", 1
        );
      }

      TEXT1.setText("");
      TEXT1.requestFocus();

    }
  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          JDialog.setDefaultLookAndFeelDecorated(true);
          C12EX08 VISUAL = new C12EX08();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      }
    );
  }	
}
