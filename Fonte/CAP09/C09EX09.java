import java.io.*;

class C09EX09 {

  public static void main(String args[]) {

    Taluno7 ALUNO = new Taluno7("Augusto Manzano",10,9,5);

    MostraDados(ALUNO);

    ALUNO.NOME = "Roberto Affonso";
    ALUNO.N1 = 10;
    ALUNO.N2 = 10;
    ALUNO.SALA = 6;

    MostraDados(ALUNO);

  }

  public static void MostraDados(Taluno7 DADOS) {
    System.out.println();
    System.out.println("Nome ........: " + DADOS.NOME);
    System.out.println("Media .......: " +
    DADOS.CalcMedia(DADOS.N1,DADOS.N2));
    System.out.println("Sala ........: " + DADOS.SALA);
    System.out.println();
    System.out.print("Situacao ....: ");
    if (Taluno2.CondAluno(DADOS.CalcMedia(DADOS.N1,DADOS.N2), 5.0))
      System.out.println("Aprovado");
    else     
      System.out.println("Reprovado");
    System.out.println();
  }

}
