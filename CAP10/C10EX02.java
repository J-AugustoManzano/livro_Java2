import java.io.*;

class C10EX02 {
  public static void main(String args[]) {

    int A[] = new int[10];
    int B[] = new int[10];

    int I;
 
    // Entrada de dados

    System.out.println();
    for (I = 0; I <= 9; I++) {
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

    for (I = 0; I <= 9; I++)
      if (I % 2 == 0) 
         B[I] = A[I] * 5;
      else
         B[I] = A[I] + 5;

    // Apresentacao dos arranjos

    System.out.println();
    for (I = 0; I <= 9; I++)
      System.out.println("A[" + (I + 1) + "] = " + A[I]);
    System.out.println();
    for (I = 0; I <= 9; I++)
      System.out.println("B[" + (I + 1) + "] = " + B[I]);
 
  }
}
