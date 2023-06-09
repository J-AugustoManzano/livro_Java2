import java.io.*;

class C10EX06 {
  public static void main(String args[]) {

    int A[] = new int[10], I, J, PESQ, ACHA;
    String RESP;
 
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

    // Pesquisa de dados

    do {

      System.out.println();
      System.out.print("Entre o valor a ser pesquisado: ");
      try {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
        PESQ = Integer.parseInt(br.readLine()); } 
      catch (Exception e) {
        PESQ = 0;
      }

      I = 0;
      ACHA = 0;
      while (I <= 9 & ACHA == 0)
        if (PESQ == A[I])
          ACHA = 1;
        else
          I++;

      if (ACHA == 1)
        System.out.print(PESQ + " localizado na posicao " + (I + 1));
      else
        System.out.print(PESQ + " nao foi localizado");

      System.out.println();
      System.out.println();
      System.out.println("Continua? [S]im / [N]ao + <Enter>.");
      System.out.print("Ou <Enter> para 'Nao': ");
      try {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
        RESP = br.readLine(); } 
      catch (Exception e) {
        RESP = "";
      }
      RESP = RESP.toUpperCase(); }

    while (RESP.compareTo("S") == 0);
 
  }
}
