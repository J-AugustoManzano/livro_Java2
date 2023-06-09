import java.io.*;

class C09EX05 {

  public static void main(String args[]) {

    Taluno3 ALUNO = new Taluno3();
 
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

    System.out.print("Entre a sala ..: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.SALA = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      ALUNO.SALA = 0;
    }

    System.out.println();
    System.out.println("Nome ........: " + ALUNO.NOME);
    System.out.println("Media .......: " + ALUNO.MEDIA);
    System.out.println("Sala ........: " + ALUNO.SALA);
    System.out.println();
    System.out.print("Situacao ....: ");

    if (Taluno2.CondAluno(ALUNO.MEDIA, 5.0))
      System.out.println("Aprovado");
    else     
      System.out.println("Reprovado");
    System.out.println();

  }
}
