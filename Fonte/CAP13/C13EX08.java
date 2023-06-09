import java.io.*;

class C13EX08 {

  private static RandomAccessFile ARQUIVO;

  public static void main(String args[]) {

    class Taluno {
      byte CODIGO;
      char NOME[] = new char[40];
      char SERIE;
      double MEDIA;
    }

    Taluno ALUNO = new Taluno();
    File NOMEARQ = new File("ARQALUX.DBJ");
    int I;

    System.out.println();

    try {
      ARQUIVO = new RandomAccessFile(NOMEARQ, "r"); }
    catch (FileNotFoundException enfe) {
      System.out.println("Arquivo sem acesso");
    }

    try {
      System.out.println("Codigo ...: " + ARQUIVO.readByte());
      System.out.print("Nome .....: ");
      for (I = 0; I < 80; I+=2) {
        ARQUIVO.seek(I + 1);
        System.out.print(ARQUIVO.readChar());
      }
      System.out.println();
      System.out.println("Serie ....: " + ARQUIVO.readChar());
      System.out.println("Media ....: " + ARQUIVO.readDouble()); 
      ARQUIVO.close(); }
    catch (IOException ioe) {
      System.out.println("Erro de leitura");
    }
 
  }
}
