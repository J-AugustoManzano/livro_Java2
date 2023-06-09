import java.io.*;

class C05EX13 {

  public static void main(String args[]) {

    int DIVIDENDO, DIVISOR, QUOCIENTE;
 
    System.out.println();

    System.out.print("Informe um valor do dividendo...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      DIVIDENDO = Integer. parseInt(br.readLine()); } 
    catch (Exception e) {
      DIVIDENDO = 0;
    }

    System.out.print("Informe um valor do divisor.....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      DIVISOR = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      DIVISOR = 0;
    }

    QUOCIENTE = DIVIDENDO / DIVISOR;

    System.out.println();
    System.out.print("Resultado = " + QUOCIENTE);
    System.out.println();

  }
}
