import java.io.*;

class C08EX03 {

  public static void main(String args[]) { 

    byte X;

    System.out.println();
    System.out.println("-------------------------");
    System.out.println("    Programa Fatorial    ");
    System.out.println("-------------------------");
    System.out.println();
    System.out.print("Entre um valor inteiro (de 0 ate 25): ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      X = Byte.parseByte(br.readLine()); } 
    catch (Exception e) {
      X = 0;
    }
    System.out.println();
    fatorial(X);
    System.out.println();
  }

  public static void fatorial(byte N) {
    long FAT = 1;
    if (N == 0)
      FAT = 0;
    else
      for (int I = 1; I <= N; I++)
        FAT *= I;
    System.out.println("Fatorial de " + N + " = " + FAT);
  }

}
