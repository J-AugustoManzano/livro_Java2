import java.io.*;

class C10EX05 {
  public static void main(String args[]) {

    String A[] = new String[5], X;
    int I, J;
 
    // Entrada de dados

    System.out.println();
    for (I = 0; I <= 4; I++) {
      System.out.print("Entre o " + (I + 1) + "o. nome: ");
      try {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
        A[I] = br.readLine(); } 
      catch (Exception e) {
        A[I] = "";
      }
    }
 
    // Processamento ordenacao

    for (I = 0; I <= 3; I++)
      for (J = I + 1; J <= 4; J++)
        if (A[I].compareTo(A[J]) > 0) {
          X = A[I];
          A[I] = A[J];
          A[J] = X;
        }

    // Apresentacao dos arranjos

    System.out.println();
    for (I = 0; I <= 4; I++)
      System.out.println((I + 1) + "o. nome = " + A[I]);
 
  }
}
