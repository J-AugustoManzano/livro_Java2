import javax.swing.*;

public class AloMundo4 {
  public static void main(String args[]) {

    JFrame TELA = new JFrame("Al�, Mundo");
    JLabel TEXTO = new JLabel("Estudo de Programa��o com Java");

    TELA.setLayout(null);
    TELA.getContentPane().add(TEXTO);

    TEXTO.reshape(30,20,210,20);

    TELA.setSize(280,100);
    TELA.setVisible(true);
    TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
