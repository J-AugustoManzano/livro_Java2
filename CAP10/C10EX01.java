import java.io.*;
import java.text.DecimalFormat;

class C10EX01 {
  public static void main(String args[]) {

    float MDG[] = new float[8];
    float SOMA = 0, MEDIA;
    int I;
    DecimalFormat df = new DecimalFormat("0.00");
 
    System.out.println();

    for (I = 0; I <= 7; I++) {
      System.out.print("Entre media do " + (I + 1) + "o. aluno: ");
      try {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
        MDG[I] = Float.parseFloat(br.readLine()); } 
      catch (Exception e) {
        MDG[I] = 0;
      }
      SOMA += MDG[I];
    }
 
    MEDIA = SOMA / 8;

    System.out.println();
    System.out.println("Media Geral = " + df.format(MEDIA));
 
  }
}
