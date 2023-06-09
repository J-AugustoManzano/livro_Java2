import java.io.*;
class C06EX12 {
  public static void main(String args[]) {

    int A, B, R;
    System.out.println();

    for (A = 1, B = 1; A + B <= 10; A += 2, B++)
      {
        R = A + B;
        System.out.println("Resultado = " + R);
      }

  }
}
