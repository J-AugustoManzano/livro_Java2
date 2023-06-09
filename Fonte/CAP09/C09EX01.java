import java.io.*;

class C09EX01 {

  public static void main(String args[]) {

    final class Taluno {
      String NOME;
      float MEDIA;
    }

    Taluno ALUNO = new Taluno();
 
    System.out.println();

    System.out.print("Entre nome ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.NOME = br.readLine(); } 
    catch (Exception e) {
      ALUNO.NOME = "";
    }
   
    System.out.print("Entre media ...: ");
     try {
       BufferedReader br = new BufferedReader(
       new InputStreamReader(System.in));
       ALUNO.MEDIA = Float.parseFloat(br.readLine()); } 
     catch (Exception e) {
       ALUNO.MEDIA = 0;
     }

     System.out.println();
     System.out.println("Nome ........: " + ALUNO.NOME);
     System.out.println("Media .......: " + ALUNO.MEDIA);
     System.out.println();

  }
}
