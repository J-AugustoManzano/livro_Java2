import java.io.*;
import java.text.DecimalFormat;

class C10EX08 {
  public static void main(String args[]) {

    float NOTA[][] = new float[8][4];
    byte I, J;
    DecimalFormat df = new DecimalFormat("00.00");
 
    for (I = 0; I <= 7; I++) {
      System.out.println();
      System.out.println();
      System.out.println("Aluno ---> " + (I + 1));
      System.out.println();
      for (J = 0; J <= 3; J++) {
        System.out.print((J + 1) + "a. Nota = ");
        try {
          BufferedReader br = new BufferedReader(
          new InputStreamReader(System.in));
          NOTA[I][J] = Float.parseFloat(br.readLine()); } 
        catch (Exception e) {
          NOTA[I][J] = 0;
        }
      }
    }
 
    System.out.println();
    System.out.println("Aluno Nota1 Nota2 Nota3 Nota4");
    System.out.println("-----------------------------");

    for (I = 0; I <= 7; I++) {
      System.out.print((I + 1) + " --> ");
      for (J = 0; J <= 3; J++)
        System.out.print(df.format(NOTA[I][J]) + " ");
      System.out.println();
    }

    System.out.println();
 
  }
}
