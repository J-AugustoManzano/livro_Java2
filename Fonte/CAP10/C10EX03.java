import java.io.*;

class C10EX03 {
  public static void main(String args[]) {

    int A[] = new int[5];
    int I, SOMA = 0;
 
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
 
    // Processamento par ou impar

    for (I = 0; I <= 4; I++)
    if (A[I] % 2 != 0)
      SOMA += A[I];

    // Apresentacao dos arranjos

    System.out.println();
    System.out.println("Soma = " + SOMA);
 
  }
}
