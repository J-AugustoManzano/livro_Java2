import java.io.*;
class C05EX01 {
  public static void main(String args[]) {
    int A, B, R;
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

    R = A + B;
    if (R > 10)
      System.out.print("Resultado = " + R);
    System.out.println();
  }
}
