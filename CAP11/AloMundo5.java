import javax.swing.*;

public class AloMundo5 {
  public static void main(String args[]) {

    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {

          JFrame.setDefaultLookAndFeelDecorated(true);

          JFrame TELA = new JFrame("Alô, Mundo");
          JLabel TEXTO = new JLabel("Estudo de Programação com Java");

          TELA.setLayout(null);
          TELA.getContentPane().add(TEXTO);
 
          TEXTO.reshape(30,20,210,20);
 
          TELA.setSize(280,100);
          TELA.setVisible(true); 
          TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
      }
    );
  }
}
