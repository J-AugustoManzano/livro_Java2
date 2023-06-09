import java.io.*;

class C13EX06 {

  private static RandomAccessFile ARQUIVO;

  public static void main(String args[]) {

    class Taluno {
      byte CODIGO;
      char SERIE;
      double MEDIA;
    }

    Taluno ALUNO = new Taluno();
    File NOMEARQ = new File("ARQALU.DBJ");

    System.out.println();

    try {
      ARQUIVO = new RandomAccessFile(NOMEARQ, "rw"); }
    catch (FileNotFoundException enfe) {
      System.out.println("Arquivo sem acesso");
    }

    try {
      ARQUIVO.seek(0);
      System.out.println("Codigo ...: " + ARQUIVO.readByte());
      ARQUIVO.seek(1);
      System.out.println("Serie ....: " + ARQUIVO.readChar());
      ARQUIVO.seek(3);
      System.out.println("Media ....: " + ARQUIVO.readDouble()); }
    catch (IOException ioe) {
      System.out.println("Erro de leitura");
    }

    System.out.println();
    System.out.print("Entre nova media ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.MEDIA = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      ALUNO.MEDIA = 0;
    }

    try {
      ARQUIVO.seek(3);
      ARQUIVO.writeDouble(ALUNO.MEDIA); 
      ARQUIVO.close(); }
    catch (IOException ioe) {
      System.out.println("Erro de escrita");
    }
 
  }
}
