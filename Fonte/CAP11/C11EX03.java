import javax.swing.*;
import java.awt.*;

public class C11EX03 extends JFrame {

  public C11EX03() {

    super("Formulário 3");

    Container  CONT   = getContentPane();

    JTextField TEXTO  = new JTextField();
    JButton    BOTAO  = new JButton("OK");
    JLabel     ROTULO = new JLabel("Texto");

    setLayout(null);

    CONT.add(TEXTO);
    CONT.add(BOTAO);
    CONT.add(ROTULO);

    TEXTO.reshape(138,20,150,20);
    BOTAO.reshape(138,50,70,20);
    ROTULO.reshape(138,80,100,20);

    setSize(427, 273);
    setVisible(true);

  }
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C11EX03 VISUAL = new C11EX03();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
      }
    );
  }

}
