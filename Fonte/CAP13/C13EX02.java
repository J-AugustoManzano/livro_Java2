import java.io.*;

class C13EX02 {
  public static void main(String args[]) {

    String NOMEARQ = "ARQNUM.XXX";
    long VALOR;
    int I;
    File CHECAGEM = new File(NOMEARQ);;

    System.out.println();
    try {
      FileOutputStream ARQNUMERO = new FileOutputStream(NOMEARQ);
      BufferedOutputStream 
        MEMOACESSO = new BufferedOutputStream(ARQNUMERO);
      DataOutputStream DADO = new DataOutputStream(MEMOACESSO);

      CHECAGEM.createNewFile();

      for (I = 1; I <= 8; I++) { 
        System.out.print("Entre o " + I + "o valor: ");
        try {
          BufferedReader br = new BufferedReader(
          new InputStreamReader(System.in));
          VALOR = Integer.parseInt(br.readLine()); } 
        catch (Exception e) {
          VALOR = 0;
        }
        DADO.writeLong(VALOR);
      }
      DADO.close(); }
    catch (IOException ioe) {
      System.out.println("Erro");
    }
 
  }
}
