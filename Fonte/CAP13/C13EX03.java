import java.io.*;

class C13EX03 {
  public static void main(String args[]) {

    String NOMEARQ = "ARQNUM.XXX";
    long VALOR;
    int I = 1;

    System.out.println();
    try {
      FileInputStream ARQNUMERO = new FileInputStream(NOMEARQ);
      BufferedInputStream 
        MEMOACESSO = new BufferedInputStream(ARQNUMERO);
      DataInputStream DADO = new DataInputStream(MEMOACESSO);
      do { 
        System.out.print(I + "o valor = ");
        VALOR = DADO.readLong();
        System.out.println(VALOR);
        I++; }
      while (true); } 
    catch (EOFException eofe) {
      System.out.println("Fim de arquivo");
    }
    catch (IOException ioe) {
      System.out.println("Erro");
    }
 
  }
}
