import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class C13EX01 extends JFrame {

  JTextField TEXT1;
  JTextField TEXT2;

  public C13EX01() {

    super("Arquivo Texto");
    Container CONT = getContentPane();

    setLayout(null);
    setSize(356, 240);
    setVisible(true);

    JLabel ROTUL1 = new JLabel("Informe mensagem a ser gravada:");
    TEXT1 = new JTextField();

    JButton BOTAO1 = new JButton("Criar");
    JButton BOTAO2 = new JButton("Gravar");
    JButton BOTAO3 = new JButton("Ler");

    JLabel ROTUL2 = new JLabel("Leitura de mensagem gravada:");
    TEXT2 = new JTextField();

    CONT.add(ROTUL1);
    CONT.add(TEXT1);
    CONT.add(BOTAO1);

    CONT.add(BOTAO2);
    CONT.add(BOTAO3);

    CONT.add(ROTUL2);
    CONT.add(TEXT2);

    ROTUL1.reshape(20,20,280,20);
    TEXT1.reshape(20,50,306,20);

    BOTAO1.reshape(20,94,98,20);
    AcionaBotao1 EVENTO1 = new AcionaBotao1();
    BOTAO1.addActionListener(EVENTO1);

    BOTAO2.reshape(124,94,98,20);
    AcionaBotao2 EVENTO2 = new AcionaBotao2();
    BOTAO2.addActionListener(EVENTO2);

    BOTAO3.reshape(228,94,98,20);
    AcionaBotao3 EVENTO3 = new AcionaBotao3();
    BOTAO3.addActionListener(EVENTO3);

    ROTUL2.reshape(20,134,280,20);
    TEXT2.reshape(20,164,306,20);
    TEXT2.setEditable(false); 

  }
 
  private class AcionaBotao1 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      try {
        FileWriter ARQTEXTO = new FileWriter("ARQTXT.XXX");
        ARQTEXTO.write("");
        ARQTEXTO.close();
        setTitle("Arquivo Texto - Criado");
        TEXT1.requestFocus(); } 
      catch (IOException ioe) {
        setTitle("Arquivo Texto - Erro");
        TEXT1.requestFocus();
      }
 
    }
  } 

  private class AcionaBotao2 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      try {
        FileWriter ARQTEXTO = new FileWriter("ARQTXT.XXX");
        ARQTEXTO.write(TEXT1.getText());
        ARQTEXTO.close();
        TEXT1.setText("");
        setTitle("Arquivo Texto - Gravado");
        TEXT1.requestFocus(); } 
      catch (IOException ioe) {
        setTitle("Arquivo Texto - Erro de Gravação");
        TEXT1.requestFocus();
      }
 
    }
  } 

  private class AcionaBotao3 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
 
      File ARQUIVO = new File("ARQTXT.XXX");
      long TAMLONGO = ARQUIVO.length();
      int TAMANHO = (int)TAMLONGO;
      
      char CARACTERE[] = new char[TAMANHO];
      String LEITURA; 
 
      try {
        FileReader ARQTEXTO = new FileReader("ARQTXT.XXX");
        ARQTEXTO.read(CARACTERE);
        ARQTEXTO.close();
        setTitle("Arquivo Texto - Lido");
        LEITURA = String.valueOf(CARACTERE);
        TEXT2.setText(LEITURA);
        TEXT1.requestFocus(); } 
      catch (IOException ioe) {
        setTitle("Arquivo Texto - Erro de Leitura");
        TEXT1.requestFocus();
      }
 
    }
  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          C13EX01 VISUAL = new C13EX01();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      }
    );
  }
}
