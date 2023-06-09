import java.io.*;
import java.text.DecimalFormat;

class C10EX10 {
  public static void main(String args[]) {

    float N1, N2, N3, N4, MD;
    DecimalFormat df = new DecimalFormat("0.00");

    N1 = Float.parseFloat(args[0]);
    N2 = Float.parseFloat(args[1]);
    N3 = Float.parseFloat(args[2]);
    N4 = Float.parseFloat(args[3]);

    MD = (N1 + N2 + N3 + N4) / 4;

    if (MD >= 5)
      System.out.print("Aluno Aprovado com Media ");
    else
      System.out.print("Aluno Reprovado com Media ");
    System.out.println(df.format(MD));

  }
}
