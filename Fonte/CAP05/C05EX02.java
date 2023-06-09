import java.io.*;
class C05EX02 {
  public static void main(String args[]) {
    int A, B, X;
    System.out.println();
   
    System.out.print("Entre o valor <A>: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      A = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      A = 0;
    }
   
    System.out.print("Entre o valor <B>: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      B = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      B = 0;
    }

    if (A > B)
      {
        X = A;
        A = B;
        B = X;
      }
    System.out.print("Valores ordenados sao: " + A + " e " + B);
    System.out.println();
  }
}
