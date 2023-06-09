import java.io.*;

class C10EX04 {
  public static void main(String args[]) {

    int A[] = new int[5];
    int I, J, X;
 
    // Entrada de dados

    System.out.println();
    for (I = 0; I <= 4; I++) {
      System.out.print("Entre o " + (I + 1) + "o. elemento: ");
      try {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
        A[I] = Integer.parseInt(br.readLine()); } 
      catch (Exception e) {
        A[I] = 0;
      }
    }
 
    // Processamento ordenacao

    for (I = 0; I <= 3; I++)
      for (J = I + 1; J <= 4; J++)
        if (A[I] > A[J]) {
          X = A[I];
          A[I] = A[J];
          A[J] = X;
        }

    // Apresentacao dos arranjos

    System.out.println();
    for (I = 0; I <= 4; I++)
      System.out.println((I + 1) + "o. valor = " + A[I]);
 
  }
}
