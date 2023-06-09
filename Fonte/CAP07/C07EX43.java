import java.io.*;
class C07EX43 {
  public static void main(String args[]) {

    String STR = "ESTUDO DE JAVA";
    int I, SEQASCII;
    char CARACTERE;

    System.out.println();
    for (I = 0; I < STR.length(); I++) {
      CARACTERE = STR.charAt(I);
      System.out.print(" " + CARACTERE + " ");
    }
    System.out.println();
    for (I = 0; I < STR.length(); I++) {
      CARACTERE = STR.charAt(I);
      SEQASCII = (int)CARACTERE;
      System.out.print(SEQASCII + " ");
    }
    System.out.println();
    
  }
}
