import java.io.*;
import java.text.DecimalFormat;
import br.com.editoraerica.livro.java.FinanMax;

class C14EX02 {
  public static void main(String args[]) { 

    DecimalFormat df = new DecimalFormat("0.0");

    double I  = 0.10 / 12;
    double FV = 20000;
    double PV = 10000;
    double R  = FinanMax.cterm(I, FV, PV) / 12;

    System.out.println();
    System.out.println("Media de " + df.format(R) + " anos");
 
  }
}
