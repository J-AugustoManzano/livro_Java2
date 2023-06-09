import java.io.*;
class C07EX46 {
  public static void main(String args[]) {

    String HEXSTR = "A";
    int INTEIRO;

    INTEIRO = Integer.valueOf(HEXSTR, 16).intValue();

    System.out.println();
    System.out.print("Valor = " + INTEIRO);
    System.out.println();
    
  }
}
