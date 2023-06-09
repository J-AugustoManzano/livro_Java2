import java.io.*;
import java.text.DecimalFormat;
import br.com.editoraerica.livro.java.FinanMax;

class C14EX05 {
  public static void main(String args[]) { 

    DecimalFormat df = new DecimalFormat("000,000.00");

    double PMT = 50000;
    double I   = 0.08;
    double N   = 20;
    double R;

    System.out.println();

    R = FinanMax.pv(PMT, I, N, 0);
    System.out.println("Valor de R$ " + df.format(R));

  }
}
