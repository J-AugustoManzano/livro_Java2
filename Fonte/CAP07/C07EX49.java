import java.io.*;
class C07EX49 {
  public static void main(String args[]) {

    int INTEIRO = 11;
    String HEXSTR;

    HEXSTR = Integer.toString(INTEIRO, 16).toUpperCase();

    System.out.println();
    System.out.print("Valor = " + HEXSTR);
    System.out.println();
    
  }
}
