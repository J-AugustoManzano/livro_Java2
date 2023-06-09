import java.io.*;
import java.text.DecimalFormat;
import br.com.editoraerica.livro.java.FinanMax;

class C14EX03 {
  public static void main(String args[]) { 

    DecimalFormat df = new DecimalFormat("0,000.00");

    double PMT = 2000;
    double I   = 0.075;
    double N   = 20;
    float  TIPO;
    double R1, R2;

    System.out.println();

    TIPO = 0;
    R1 = FinanMax.fv(PMT, I, N, TIPO);
    System.out.println("Final de periodo  R$ " + df.format(R1));

    TIPO = 1;
    R2 = FinanMax.fv(PMT, I, N, TIPO);
    System.out.println("Inicio de periodo R$ " + df.format(R2));
 
  }
}
