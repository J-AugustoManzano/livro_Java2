import java.io.*;

class C09EX08 {

  public static void main(String args[]) {

    Taluno6 ALUNO = new Taluno6();
 
    System.out.println();
    System.out.print("Entre nome .....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.NOME = br.readLine(); } 
    catch (Exception e) {
      ALUNO.NOME = "";
    }
   
    System.out.print("Entre a nota 1 .: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.N1 = Float.parseFloat(br.readLine()); } 
    catch (Exception e) {
      ALUNO.N1 = 0;
    }

    System.out.print("Entre a nota 2 .: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.N2 = Float.parseFloat(br.readLine()); } 
    catch (Exception e) {
      ALUNO.N2 = 0;
    }

    System.out.print("Entre a sala ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALUNO.SALA = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      ALUNO.SALA = 0;
    }

    System.out.println();
    System.out.println("Nome ........: " + ALUNO.NOME);
    System.out.println("Media .......: " +
    ALUNO.CalcMedia(ALUNO.N1,ALUNO.N2));
    System.out.println("Sala ........: " + ALUNO.SALA);
    System.out.println();
    System.out.print("Situacao ....: ");

    if (Taluno2.CondAluno(ALUNO.CalcMedia(ALUNO.N1,ALUNO.N2), 5.0))
      System.out.println("Aprovado");
    else     
      System.out.println("Reprovado");
    System.out.println();

  }
}
