import java.io.*;
class C05EX06 {
  public static void main(String args[]) {

    String NOME1, NOME2;
    int SEXO1, SEXO2, I;

    System.out.println();

    System.out.print("Entre o primeiro nome ....................: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      NOME1 = br.readLine(); } 
    catch (Exception e) {
      NOME1 = "";
    }

    System.out.print("Entre o sexo: M --> [1] // F --> [2] .....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      SEXO1 = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      SEXO1 = 0;
    }

    System.out.print("Entre o segundo nome .....................: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      NOME2 = br.readLine(); } 
    catch (Exception e) {
      NOME2 = "";
    }

    System.out.print("Entre o sexo: M --> [1] // F --> [2] .....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      SEXO2 = Integer.parseInt(br.readLine()); } 
    catch (Exception e) {
      SEXO2 = 0;
    }

    if (SEXO1 == 1 ^ SEXO2 == 1)
      System.out.println(NOME1 + " pode se casar com " + NOME2);
    else
      System.out.println(NOME1 + " nao pode se casar com " + NOME2);

    System.out.println();
  }
}
