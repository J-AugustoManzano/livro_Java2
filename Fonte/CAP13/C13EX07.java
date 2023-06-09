import java.io.*;

class C13EX07 {

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
    String ENTRASERIE;
    String ENTRANOME;
    int I;

    System.out.println();

    System.out.print("Entre o codigo ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.CODIGO = Byte.parseByte(br.readLine()); } 
    catch (Exception e) {
      ALUNO.CODIGO = 0;
    }

    System.out.print("Entre o nome .....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ENTRANOME = br.readLine(); } 
    catch (Exception e) {
      ENTRANOME = "";
    }

    if (ENTRANOME.length() < 40)
      for (I = 0; I < ENTRANOME.length(); I++)
        ALUNO.NOME[I] = ENTRANOME.toUpperCase().charAt(I);
    else
      for (I = 0; I < 40; I++)
        ALUNO.NOME[I] = ENTRANOME.toUpperCase().charAt(I);

    System.out.print("Entre a serie ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ENTRASERIE = br.readLine(); } 
    catch (Exception e) {
      ENTRASERIE = "";
    }
    ALUNO.SERIE = ENTRASERIE.toUpperCase().charAt(0);
  
    System.out.print("Entre a media ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.MEDIA = Double.parseDouble(br.readLine()); } 
    catch (Exception e) {
      ALUNO.MEDIA = 0;
    }

    try {
      ARQUIVO = new RandomAccessFile(NOMEARQ, "rw"); }
    catch (FileNotFoundException fnfe) {
      System.out.println("Arquivo sem acesso");
    }

    try {
      ARQUIVO.writeByte(ALUNO.CODIGO);
      for (I = 0; I < 40; I++)
        ARQUIVO.writeChar(ALUNO.NOME[I]);
      ARQUIVO.writeChar(ALUNO.SERIE);
      ARQUIVO.writeDouble(ALUNO.MEDIA); 
      ARQUIVO.close(); }
    catch (IOException ioe) {
      System.out.println("Erro de escrita");
    }
 
  }
}
