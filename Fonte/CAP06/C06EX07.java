import java.io.*;
class C06EX07 {
  public static void main(String args[]) {

    int N, I = 1;
    long FAT = 1;

    System.out.println();
    System.out.print("Programa Fatorial\n");
    System.out.print("\n\nFatorial de qual valor: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      N = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      N = 0;
    }

    do
      {
        FAT *= I;
        I++;
      }
    while (I <= N);

    System.out.println();
    System.out.println("Fatorial de " + N + " = " + FAT);

  }
}
