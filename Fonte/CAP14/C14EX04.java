import java.io.*;
import java.text.DecimalFormat;
import br.com.editoraerica.livro.java.FinanMax;

class C14EX04 {
  public static void main(String args[]) { 

    DecimalFormat df = new DecimalFormat("0,000.00");

    double PV = 22000;
    double I  = 0.12/12;
    double N  = 24;
    float  TIPO;
    double R1, R2;

    System.out.println();

    TIPO = 0;
    R1 = FinanMax.pmt(PV, I, N, TIPO);
    System.out.println("Final de periodo  R$ " + df.format(R1));

    TIPO = 1;
    R2 = FinanMax.pmt(PV, I, N, TIPO);
    System.out.println("Inicio de periodo R$ " + df.format(R2));
 
  }
}
