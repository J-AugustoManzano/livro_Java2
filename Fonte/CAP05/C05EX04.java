import java.io.*;
class C05EX04 {
  public static void main(String args[]) {
    int NUMERO;
    System.out.println();
   
    System.out.print("Entre um valor: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      NUMERO = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      NUMERO = 0;
    }
   
    if (NUMERO >= 20 && NUMERO <= 90)
      System.out.print("O valor esta entre 20 e 90");
    else
      System.out.print("O valor nao esta entre 20 e 90");
    System.out.println();
  }
}
