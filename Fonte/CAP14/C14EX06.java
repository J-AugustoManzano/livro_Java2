import java.io.*;
import java.text.DecimalFormat;
import br.com.editoraerica.livro.java.FinanMax;

class C14EX06 {
  public static void main(String args[]) { 

    DecimalFormat df = new DecimalFormat("0.00");

    double FV = 18000;
    double PV = 10000;
    double N  = 60;
    float PERIODO;
    double R1, R2;

    System.out.println();
    
    PERIODO = 0;
    R1 = FinanMax.rate(FV, PV, N, PERIODO);
    System.out.println("Taxa a. m. = " + df.format(R1) + "%");

    PERIODO = 1;
    R2 = FinanMax.rate(FV, PV, N, PERIODO);
    System.out.println("Taxa a. a. = " + df.format(R2) + "%");

  }
}
