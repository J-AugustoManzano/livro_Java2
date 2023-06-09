import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class C11EX04 extends JFrame {

  JTextField TEXTO;

  JLabel ROTULO;

  public C11EX04() {

    super("Formulário 4");

    Container  CONT   = getContentPane();
    JButton    BOTAO  = new JButton("OK");

    TEXTO = new JTextField();
    ROTULO = new JLabel("Texto");

    setLayout(null);

    CONT.add(TEXTO);
    CONT.add(BOTAO);
    CONT.add(ROTULO);

    TEXTO.reshape(138,20,150,20);
    BOTAO.reshape(138,50,70,20);
    ROTULO.reshape(138,80,160,20);

    Captura EVENTO = new Captura();
    BOTAO.addActionListener(EVENTO);

    setSize(427, 273);
    setVisible(true);

  }

  private class Captura implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
      String SAIDA = TEXTO.getText();
      ROTULO.setText(SAIDA);
    }
  } 
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C11EX04 VISUAL = new C11EX04();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
      }
    );
  }

}
