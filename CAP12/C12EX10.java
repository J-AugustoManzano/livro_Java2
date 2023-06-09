import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class C12EX10 extends JFrame {

  JLabel ROTUL2;
  JLabel ROTUL3;

  JList LISTA;

  String ESTADO[] = {
    "Acre",             "Alagoas",             "Amap�",
    "Amazonas",         "Bahia",               "Cear�",
    "Distrito Federal", "Esp�rito Santo",      "Goi�s",
    "Maranh�o",         "Mato Grosso",         "Mato Grosso do Sul",
    "Minas Gerais",     "Par�",                "Para�ba",
    "Paran�",           "Pernambuco",          "Piau�",
    "Rio de Janeiro",   "Rio Grande do Norte", "Rio Grande do Sul",
    "Rond�nia",         "Roraima",             "Santa Catarina",
    "S�o Paulo",        "Sergipe",             "Tocantins"
  };

  String UNIFED[] = {
    "AC", "AL", "AP",
    "AM", "BA", "CE",
    "DF", "ES", "GO",
    "MA", "MT", "MS",
    "MG", "PA", "PB",
    "PR", "PE", "PI",
    "RJ", "RN", "RS",
    "RO", "RR", "SC",
    "SP", "SE", "TO" 
  };

  String CAPITAL[] = {
    "Rio Branco",     "Macei�",    "Macap�",
    "Manaus",         "Salvador",  "Fortaleza",
    "Bras�lia",       "Vit�ria",   "Goi�nia", 
    "S�o Lu�s",       "Cuiab�",    "Campo Grande",
    "Belo Horizonte", "Bel�m",     "Jo�o Pessoa",
    "Curitiba",       "Recife",    "Teresina",
    "Rio de Janeiro", "Natal",     "Porto Alegre",
    "Porto Velho",    "Boa Vista", "Florian�polis",
    "S�o Paulo",      "Aracaju",   "Palmas"
  };

  public C12EX10() {

    super("Estados Brasileiros");
    Container CONT = getContentPane();

    JLabel ROTUL1 = new JLabel("Selecione um Estado");
    JLabel ROTUL4 = new JLabel("Capital:");
    JLabel ROTUL5 = new JLabel("Unidade Federativa:");

    LISTA  = new JList(ESTADO);
    ROTUL2 = new JLabel(CAPITAL[0]);
    ROTUL3 = new JLabel(UNIFED[0]);

    LISTA.setSelectedIndex(0);
    LISTA.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
 
    ROTUL2.setHorizontalAlignment(JLabel.RIGHT);
    ROTUL3.setHorizontalAlignment(JLabel.RIGHT);

    JScrollPane ROLAGEM = new JScrollPane(LISTA);

    setLayout(null);
 
    CONT.add(ROTUL1);
    CONT.add(ROLAGEM);
    CONT.add(ROTUL4);
    CONT.add(ROTUL5);
    CONT.add(ROTUL2);
    CONT.add(ROTUL3);

    ROTUL1.reshape(75,20,200,20);
    ROLAGEM.reshape(75,50,250,95);
    ROTUL4.reshape(75,150,130,20);
    ROTUL5.reshape(75,170,130,20);

    ROTUL2.reshape(195,150,130,20);
    ROTUL3.reshape(195,170,130,20);

    LISTA.addListSelectionListener(new EVENTO());
 
    setSize(400, 245);
    setVisible(true);

  }

  private class EVENTO implements ListSelectionListener {
    public void valueChanged (ListSelectionEvent lse) {

      int I = LISTA.getSelectedIndex();
      String MOSTRACAP = CAPITAL[I];
      String MOSTRAUFE = UNIFED[I];

      ROTUL2.setText(MOSTRACAP);
      ROTUL3.setText(MOSTRAUFE);

    }
  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          JDialog.setDefaultLookAndFeelDecorated(true);
          C12EX10 VISUAL = new C12EX10();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      }
    );
  }	
}
