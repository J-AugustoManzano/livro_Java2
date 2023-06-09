import java.io.*;

class C13EX05 {

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
      ARQUIVO = new RandomAccessFile(NOMEARQ, "r"); }
    catch (FileNotFoundException enfe) {
      System.out.println("Arquivo sem acesso");
    }

    try {
      System.out.println("Codigo ...: " + ARQUIVO.readByte());
      System.out.println("Serie ....: " + ARQUIVO.readChar());
      System.out.println("Media ....: " + ARQUIVO.readDouble()); 
      ARQUIVO.close(); }
    catch (IOException ioe) {
      System.out.println("Erro de leitura");
    }
 
  }
}
