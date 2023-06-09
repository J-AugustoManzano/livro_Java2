import java.io.*;
import java.text.DecimalFormat;
import br.com.editoraerica.livro.java.FinanMax;

class C14EX07 {
  public static void main(String args[]) { 

    DecimalFormat df = new DecimalFormat("0.0");

    double PMT = 2000;
    double I   = 0.075;
    double FV  = 100000;
    double R = FinanMax.term(PMT, I, FV);

    System.out.println();
    System.out.println("Levara " + df.format(R) + " anos");

  }
}
